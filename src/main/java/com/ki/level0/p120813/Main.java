package com.ki.level0.p120813;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] a = new Solution().solution(10);
        System.out.println(Arrays.toString(a));
        int[] b = new Solution().solution(15);
        System.out.println(Arrays.toString(b));
    }
}
class Solution {
    public int[] solution(int n) {
        int[] answer;
        if(n%2 == 0){
            answer = new int[n / 2];
        }
        else{
            answer = new int[(n + 1) / 2];
        }
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (i * 2) + 1;
        }
        return answer;
    }
}