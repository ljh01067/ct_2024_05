package com.codeup.p1000.p1To100.p1027;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split("\\.");
        System.out.printf("%s-%s-%s",a[2],a[1],a[0]);
    }
}