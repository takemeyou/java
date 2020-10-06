package cn.pxxy.proxty.CGLIBProxy;

import net.sf.cglib.proxy.Enhancer;

public class CGlibTest {

    public static void main(String[] args) {
        Enhancer eh = new Enhancer();

        eh.setCallback(new CglibProxy());
        eh.setSuperclass(UserDaoImpl.class);

        UserDaoImpl udi = (UserDaoImpl) eh.create();
        udi.add();
        udi.delete();
        String name = udi.find("faker");
        System.out.println(name);
        udi.update();
    }
}
