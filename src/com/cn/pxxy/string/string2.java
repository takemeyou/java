package com.cn.pxxy.string;

import java.io.File;
import java.util.ArrayList;

public class string2
{

    String tt = new String("faker");
    char[] tk = {'s','t','g','g'};

    public void change(String op,char[] ch){
        System.out.println(op);
        op = "uzi";
        ch[0] = 'i';

        System.out.println(op);
        System.out.println(ch);
        System.out.println("__________");
    }
    public static void main(String[] args) {
        /*string2 s2 = new string2();
        s2.change(s2.tt,s2.tk);
        System.out.println(s2.tt);
        System.out.println(s2.tk);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder("lpl");
        StringBuffer abb = new StringBuffer(7);
        //sb.setCharAt(1,'f');
        System.out.println(abb.length());


        ArrayList arrayList = new ArrayList();*/
        File file = new File("test.txt");
        file.renameTo(new File("file.txt"));
        System.out.println(file.getPath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.canRead());
    }



}
