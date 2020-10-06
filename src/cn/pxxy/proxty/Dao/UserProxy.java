package cn.pxxy.proxty.Dao;


public class UserProxy implements UserDao {
    private UserDaoImpl udl;

    public UserProxy(UserDaoImpl udl) {
        if(udl.getClass() == UserDaoImpl.class) {
            this.udl = udl;
        }
    }
    @Override
    public void add() {

        //这里可以做一些不太重要的日志代码
        System.out.println("代理类做得一些日志代码");
        udl.add();
    }

    @Override
    public void delete() {
        //这里可以做一些不太重要的日志代码
        System.out.println("代理类做得一些日志代码");
        udl.delete();
    }

    @Override
    public void update() {
        //这里可以做一些不太重要的日志代码
        System.out.println("代理类做得一些日志代码");
        udl.update();
    }

    @Override
    public int find(String name) {
        //这里可以做一些不太重要的日志代码
        System.out.println("代理类做得一些日志代码");
        udl.find(name);
        return 0;
    }
}
