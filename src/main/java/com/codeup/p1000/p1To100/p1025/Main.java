package com.codeup.p1000.p1To100.p1025;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split("");
        System.out.println("["+Integer.parseInt(a[0]) * 10000+"]");
        System.out.println("["+Integer.parseInt(a[1]) * 1000+"]");
        System.out.println("["+Integer.parseInt(a[2]) * 100+"]");
        System.out.println("["+Integer.parseInt(a[3]) * 10+"]");
        System.out.println("["+Integer.parseInt(a[4])+"]");
    }
}