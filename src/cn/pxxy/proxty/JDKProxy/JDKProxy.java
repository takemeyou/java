package cn.pxxy.proxty.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy implements InvocationHandler {

    private Object target;

    public Object getJDKProxy(Object target) {
        this.target = target;
        Object proxy = (Object) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);

        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+"开始.....");
        Object result = method.invoke(target,args);
        System.out.println(method.getName()+"结束");

        return result;
    }
}
