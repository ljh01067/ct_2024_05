package com.ki.levle1.p12921;

public class Main {
    public static void main(String[] args){
        System.out.println(new Solution().solution(10));
        System.out.println(new Solution().solution(5));
    }
}

class Solution {
    public static boolean isPrimeNumber(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (isPrimeNumber(i)) {
                answer++;
            }
        }

        return answer;
    }
}