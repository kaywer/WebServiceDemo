import com.geekarms.client.UserServiceClient;

import com.geekarms.ws.interfaces.MapUserType;
import com.geekarms.ws.interfaces.User;
import com.geekarms.ws.interfaces.UserService;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kaywer on 2017/2/8.
 */

public class UserServiceClientTest {
    private UserService userService;
    private User user1;
    private User user2;
    private User user3;

    @Before
    public void before(){
        userService = UserServiceClient.getInstance();
        user1 = userService.addUser("geek", 10);
        user2 = userService.addUser("arms", 20);
        user3 = userService.addUser("geekarms", 30);
    }

    @Test
    public void testFindById(){
        User testUser = userService.findById(user1.getId());
        assert testUser.getAge() == 10;
        assert "geek".equals(testUser.getName());
    }

    @Test
    public void testFindAll(){
        assert userService.findAll().size() >= 3;
    }

    @Test
    public void testFindMap(){
        MapUserType mapUserType = userService.findUserMap();
        assert mapUserType.getList().size() >=3 ;
    }
}
