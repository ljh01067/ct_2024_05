package com.codeup.p1000.p1To100.p1019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(sc.next()).useDelimiter("[.\n]");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.printf("%04d.%02d.%02d",a,b,c);
    }
}