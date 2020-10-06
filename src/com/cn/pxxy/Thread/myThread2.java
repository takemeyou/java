package com.cn.pxxy.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class myThread2 {

    public static void main(String[] args) {

        String s = new String();
        //1、提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(15);
        //2、执行指定的线程的操作，需要提供实现Runnable接口或Callable接口实现类的对象
        service.execute(new myThread());
        service.execute(new myThread1());

        //关闭连接池
        service.shutdown();
    }
}
