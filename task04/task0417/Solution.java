package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a==b && a==c){
            System.out.println(a + " " + b + " " +c);
        }
        else {
            if (a==b || a==c){
                System.out.println(a + " " + a);
            }
            if (b == c){
                System.out.println(b + " " + c);
            }
        }
        //напишите тут ваш код
    }
}