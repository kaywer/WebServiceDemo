WSBase:
  作为此WebServiceDemo的基础包，通过mvn install打包进本地maven仓库，在Server和Client中dependency.

WSServer:
  WebService服务端.
  
WSClient1:
  使用cxf生成client，但无需生成WebService客户端代码，直接通过maven依赖WSBase解决编译依赖.
  
WSClient2:
  项目代码中无需引入cxf框架，利用wsimport (jdk)或者wsdl2java (cxf)命令，根据服务端产生的wsdl生成客户端代码。
