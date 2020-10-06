package cn.pxxy.proxty.Dao;

public class test {


    public static void main(String[] args) {
        UserDaoImpl faker = new UserDaoImpl();

        UserProxy proxy = new UserProxy(faker);
        proxy.add();
        proxy.delete();
        proxy.find("uzi");
        proxy.update();
    }

}
