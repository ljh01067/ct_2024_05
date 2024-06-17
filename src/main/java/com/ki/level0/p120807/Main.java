package com.ki.level0.p120807;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println(new Solution().solution(2,3));
        System.out.println(new Solution().solution(11,11));
    }
}

class Solution {
    int solution(int num1, int num2) {
        if (num1 == num2) {
            return 1;
        }
        return -1;
    }
}

