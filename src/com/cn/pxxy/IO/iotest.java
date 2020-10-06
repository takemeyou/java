package com.cn.pxxy.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class iotest {


    public static void main(String[] args) throws IOException {
        File file = new File("io.txt");
        FileReader fileReader = new FileReader(file);


        char[] cbuf = new char[8];
        int len;
        /**int data = fileReader.read();
        while(data != -1){
            data = fileReader.read();
        }**/
        while((len = fileReader.read(cbuf)) != -1){
            for (int i = 0; i <len ; i++) {
                System.out.println(cbuf[i]);
            }
        }



        fileReader.close();



    }

}
