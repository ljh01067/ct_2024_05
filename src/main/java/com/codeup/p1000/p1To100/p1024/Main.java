package com.codeup.p1000.p1To100.p1024;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        for(int i = 0; i<a.length; i++){
            System.out.printf("'%c'\n",a[i]);
        }
    }
}