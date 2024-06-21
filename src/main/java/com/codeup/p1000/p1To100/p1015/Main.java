package com.codeup.p1000.p1To100.p1015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        String b = String.format("%.2f",a);
        System.out.println(b);
    }
}