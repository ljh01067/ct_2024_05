package com.ki.level0.p120814;

public class Main {
    public static void main(String[] args){
        System.out.println(new Solution().solution(7));
        System.out.println(new Solution().solution(1));
        System.out.println(new Solution().solution(15));
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n*i;i++){
            answer++;
            if(7*(i-1)<n&&n<=7*i){
                break;
            }
        }
        return answer;
    }
}