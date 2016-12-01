#开发服务端

1.Intellij IDEA创建project JavaWeb  
目录结构  
- src  
- web  
- out

2.配置Tomcat7.0.70

3.src创建package name，create service interface  
- UserService/UserServiceImpl

4.发布Service publish  
Endpoint.publish(address, new UserServiceImpl())

#测试
- 访问地址address?wsdl - http://127.0.0.1:8900/server?wsdl


#开发客户端
1.IDEA创建子目录client  
创建src目录，标记为source root

2.使用wsimport -keep wsdl(url)  
- 打开terminal，cd进入JavaWeb/client/src  
- wsimport -keep wsdl(url),将自动生成java接口代码，供调用
* 完整命令wsimport -d generated -s src -p com.api.service -keep http://127.0.0.1:8900/server\?wsdl

3.编写client调用service类 client/UserClient.java


#调用第三方webservice接口
1.在project下创建对应需求到第三方模块目录third/src  
2.wsimport -keep wsdl(url),将自动生成java接口代码，供调用  
3.编写client调用service类 client/ThirdClient.java