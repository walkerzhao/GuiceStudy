Guice的学习demo

# 入门hello，world
* 定义接口和实现类
* 一个Module，指定了接口是实现类之间的绑定关系；
* 使用Guice Inject 进行调用。


# 使用junit进行方便测试

# Binder
* 绑定接口和实现类之间的关系；
* 一个接口只能绑定一个实现类，不过可以通过注解加以区分，Guice中自带的有：@Named
* 可以绑定实现类、实例以及Provider

# Injectors
* 会使用configure中的配置，去获取实现类，从而生成对象；

# Module
* module维护一组bindings。 一个应用中可以有多个module；

# Guice
* 通过Guice建立Injector和Module之间的联系；


# Guice常用的几个注解
* Implemented By--用于指向接口的实现类；
* Inject--将实例注入到客户端代码中，可以通过构造函数、成员变量、方法注入；
* Provided By--为接口定制化创建对象的流程；
* Singleton--单例模式的对象

# Guice AOP
* 看看jungle-db的aop





# 参考帖子：
* Guice入门：http://blog.csdn.net/u011870547/article/details/52622097
* Guice Wiki：https://github.com/google/guice/wiki/Motivation
* 慕课网Guice作者的课程： http://www.imooc.com/video/15924