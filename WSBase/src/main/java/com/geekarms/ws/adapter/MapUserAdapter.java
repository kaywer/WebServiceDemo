package com.geekarms.ws.adapter;

import com.geekarms.entity.User;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by kaywer on 2017/2/8.
 */
public class MapUserAdapter extends XmlAdapter<MapUserAdapter.MapUserType, Map<Integer, User>> {
    @Override
    public Map<Integer, User> unmarshal(MapUserType v) throws Exception {
        return v.getList().stream().collect(Collectors.toMap(MapUserType.Entry::getKey, MapUserType.Entry::getUser));
    }

    @Override
    public MapUserType marshal(Map<Integer, User> v) throws Exception {
        List<MapUserType.Entry> list = v.entrySet().stream().map(mapEntry -> {
            MapUserType.Entry mapUserTypeEntry = new MapUserType.Entry();
            mapUserTypeEntry.setKey(mapEntry.getKey());
            mapUserTypeEntry.setUser(mapEntry.getValue());
            return mapUserTypeEntry;
        }).collect(Collectors.toList());
        MapUserType mapUserType = new MapUserType();
        mapUserType.setList(list);
        return mapUserType;
    }

    public static class MapUserType{

        public static class Entry{
            private Integer key;

            private User user;

            public Integer getKey() {
                return key;
            }

            public void setKey(Integer key) {
                this.key = key;
            }

            public User getUser() {
                return user;
            }

            public void setUser(User user) {
                this.user = user;
            }
        }


        private List<Entry> list = new ArrayList<>();

        public List<Entry> getList() {
            return list;
        }

        public void setList(List<Entry> list) {
            this.list = list;
        }
    }
}
