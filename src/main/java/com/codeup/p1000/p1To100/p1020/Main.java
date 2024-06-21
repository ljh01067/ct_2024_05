package com.codeup.p1000.p1To100.p1020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";
        for(char c : a.toCharArray()){
            if(Character.isDigit(c)) {
                b += c;
            }
        }
        System.out.println(b);
    }
}