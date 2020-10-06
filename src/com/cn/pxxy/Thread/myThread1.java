package com.cn.pxxy.Thread;


import static java.lang.Thread.currentThread;

public class myThread1 implements Runnable{

    public static void main(String[] args) {
        myThread1 mt1 = new myThread1();

        Thread t1 = new Thread(mt1);

        t1.start();


    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(currentThread().getName()+"---"+i);
            /*try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
