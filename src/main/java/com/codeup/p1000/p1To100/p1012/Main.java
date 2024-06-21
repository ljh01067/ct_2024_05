package com.codeup.p1000.p1To100.p1012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextFloat();
        String a = String.format("%.6f",x);
        System.out.println(a);
    }
}