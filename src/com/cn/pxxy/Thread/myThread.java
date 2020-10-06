package com.cn.pxxy.Thread;

public class myThread extends Thread{

    public static void main(String[] args) {
        myThread t1 = new myThread();
       // myThread t2 = new myThread();

        t1.start();
        t1.start();
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(currentThread().getName()+"****"+i);
            /*try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
