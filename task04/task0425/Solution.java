package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //1
        if (a > 0 && b > 0){
            System.out.println(1);
        }

        //2
        if (a < 0 && b > 0){
            System.out.println(2);
        }

        //3
        if (a < 0 && b < 0){
            System.out.println(3);
        }

        //4
        if (a > 0 && b < 0){
            System.out.println(4);
        }
        //напишите тут ваш код
    }
}
