package cn.pxxy.proxty.Protexy;


import cn.pxxy.proxty.Dao.UserDao;

public class userImpl1 implements UserDao {
    @Override
    public void add() {
        System.out.println("代理类做得一些日志代码");
        System.out.println("业务类执行add().......");
    }
    @Override
    public void delete() {
        System.out.println("代理类做得一些日志代码");
        System.out.println("业务类执行delete().......");
    }
    @Override
    public void update() {
        System.out.println("代理类做得一些日志代码");
        System.out.println("业务类执行update().......");
    }
    @Override
    public int find(String name) {
        System.out.println("代理类做得一些日志代码");
        System.out.println("业务类执行find()......."+name);
        return 0;
    }
}
