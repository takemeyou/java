package cn.pxxy.proxty.JDKProxy;

import cn.pxxy.proxty.Dao.UserDaoImpl;

import java.lang.reflect.Proxy;

public class test {
    public static void main(String[] args) {
        JDKProxy jdkProxy = new JDKProxy();
        UserDaoImpl1 userdaoimpl = new UserDaoImpl1();

        /**
         * 第一种：调用在代理类中的一个方法，好处 是在调用newProxyInstance方法中的invoke方法之前可以做些其他的事
         */
        //UserDaoImpl1 userimpl = (UserDaoImpl1) jdkProxy.getJDKProxy(userdaoimpl);
        UserDao1 userimpl = (UserDao1) jdkProxy.getJDKProxy(userdaoimpl);
        /**
         * 第二种，直接调用Proxy类的newProxyInstance方法，调用newProxyInstance方法也就自动的会调用在代理类中被重写的invoke方法。注意：返回值是被代理类所实现的接口，不要写成了让被代理类去接收。如下：
         * UserDaoImpl1 userimpl = (UserDaoImpl1) Proxy.newProxyInstance(userdaoimpl.getClass().getClassLoader(),userdaoimpl.getClass().getInterfaces(),jdkProxy);--错误
         * 参数：
         * ClassLoader loader：被代理类的加载类
         * Class<?>[] interfaces：被代理类所实现的接口
         * InvocationHandler h：是实现InvocationHandler类的类，也就是代理类
         *
         */
        // UserDao1 userimpl = (UserDao1) Proxy.newProxyInstance(userdaoimpl.getClass().getClassLoader(),userdaoimpl.getClass().getInterfaces(),jdkProxy);
        userimpl.add();
        userimpl.delete();
        userimpl.update();
        userimpl.find("faker");
    }




}
