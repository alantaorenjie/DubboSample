## Spring Boot集成Dubbo工程



|    模块    |   功能描述   |
| :--------: | :----------: |
| common-api | 接口公共模块 |
| providers  |  服务提供者  |
| consumers  |  服务消费者  |



#### 注册中心使用zookeeper

```shell
#下载地址
http://apache.01link.hk/zookeeper/

#解压、运行
./zkServer.sh start

```



#### 服务提供者和和服务消费者配置注册中心

```properties
#服务提供者
dubbo.application.name=springboot-provider
dubbo.registry.address=zookeeper://192.168.1.60:2181

#服务消费者
dubbo.application.name=springboot-consumer
dubbo.registry.address=zookeeper://192.168.1.60:2181
```

#### 运行

```she
#1、 启动zookeeper
./zkServer.sh start

# 2、运行服务提供者
启动providers模块，即运行ProvidersApplication.java

# 3、运行服务消费者
调用远程服务，运行AnnotationAction.java中doSayHello方法，调用测试类即可ConsumersApplicationTests.java

```

