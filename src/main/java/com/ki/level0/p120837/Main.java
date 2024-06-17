package com.ki.level0.p120837;

public class Main {
    public static void main(String[] args){
    }
}
class Solution {
    public int solution(int hp) {
        int a_a = 5;
        int a_b = 3;
        int a = hp/a_a;
        int l_a = hp%a_a;
        int b = l_a/a_b;
        int l_b = l_a%a_b;
        int c = a+b+l_b;
        return c;
    }
}