package cn.pxxy.proxty.JDKProxy;

//被代理类
public class UserDaoImpl1 implements UserDao1 {
    @Override
    public void add() {
        System.out.println("业务类执行add().......");
    }

    @Override
    public void delete() {
        System.out.println("业务类执行delete().......");
    }

    @Override
    public void update() {
        System.out.println("业务类执行update().......");
    }

    @Override
    public int find(String name) {
        System.out.println("业务类执行find()......."+name);
        return 90;
    }
}
