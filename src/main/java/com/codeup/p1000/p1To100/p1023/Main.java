package com.codeup.p1000.p1To100.p1023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] value = sc.next().split("[.]");
        int a = Integer.parseInt(value[0]);
        int b = Integer.parseInt(value[1]);

        System.out.printf("%d\n%d", a, b);
    }
}