package cn.pxxy.proxty.CGLIBProxy;


//被代理类
public class UserDaoImpl{
    public void add() {
        System.out.println("业务类执行add().......");
    }

    public void delete() {
        System.out.println("业务类执行delete().......");
    }

    public void update() {
        System.out.println("业务类执行update().......");
    }
    public String find(String name) {
        System.out.println("业务类执行find()......."+name);
        return name;
    }
}
