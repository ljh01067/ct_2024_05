package com.ki.level0.p120811;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println(new Solution().solution(new int[]{1,2,3,4,5}));
        System.out.println(new Solution().solution(new int[]{2,1,1,1,1}));
    }
}

class Solution {
    public int solution(int[] array) {
        int a = 0;
        Arrays.sort(array);
        a = array[array.length / 2];

        return  a;

    }
}

