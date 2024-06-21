package com.beakjoon.입출력과사칙연산.s11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*v1
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        System.out.println(a + b + c);
        */
        //v2
        String[] input = sc.nextLine().split(" ");
        long sum = 0;
        for (String s : input) {
            sum += Long.parseLong(s);
        }
        System.out.println(sum);
        sc.close();
    }
}
