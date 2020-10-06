package com.cn.pxxy.string;

public class String1 {


    public static void main(String[] args) {



        String s1 = "lol";
        String s2 = new String("lol");
        //s1 = "lpl";
        System.out.println(s1 == s2);

        String s3 = "pop";
        s3 += "lol";
        System.out.println(s3);
        System.out.println(s3 == s1);



        String s4 = "lol";
        String s5 = s4.replace('l', 'p');
        System.out.println(s5 == s2);
        System.out.println(s5);

        System.out.println("*********************");
        String t1 = "javaee";
        String t2 = "mysql";
        String t3 = "javaeemysql";
        String t4 = "javaee" + "mysql";
        String t5 = t1 + "mysql";
        String t6 = "javaee" + t2;
        String t7 = t1+ t2;
        System.out.println(t3 == t4);
        System.out.println(t3 == t5);
        System.out.println(t3 == t6);
        System.out.println(t5 == t6);

        System.out.println(t7 == t5);
        System.out.println(t7 == t3);

    }


}
