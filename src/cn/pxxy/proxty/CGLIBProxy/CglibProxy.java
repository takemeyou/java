package cn.pxxy.proxty.CGLIBProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println(method.getName()+"开始执行...."+methodProxy.getSuperName());
        Object o = methodProxy.invokeSuper(obj, objects);
        System.out.println(method.getName()+"执行完毕...."+objects);
        System.out.println("=====================================");
        return o;
    }
}
