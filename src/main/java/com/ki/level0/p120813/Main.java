package com.ki.level0.p120813;

public class Main {
    public static void main(String[] args){
        System.out.println(new Solution().solution(10));
        System.out.println(new Solution().solution(15));
    }
}
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        if(n%2 == 0){
            int a = 1;
            for(int i = 0;i<(n/2)-1; i++){
                answer[i] += a;
                a+=2;
            }
        }
        else{
            int a = 1;
            for(int i = 0;i<(n+1)/2-1; i++){
                answer[i] += a;
                a+=2;
            }
        }
        return answer;
    }
}