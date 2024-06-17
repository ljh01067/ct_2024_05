package clas.d0617eight;

import static clas.d0617eight.Math.isPrimeNumber;

class Main {
    public static void main(String[] args) {

        boolean rs = Math.isPrimeNumber(1);
        System.out.println("1은(는) 소수인가? : "+rs);
        // 출력 : rs : false

        rs = Math.isPrimeNumber(2);
        System.out.println("2은(는) 소수인가? : "+rs);
        // 출력 : rs : true

        rs = Math.isPrimeNumber(4);
        System.out.println("4은(는) 소수인가? : "+rs);
        // 출력 : rs : false

        rs = Math.isPrimeNumber(7);
        System.out.println("7은(는) 소수인가? : "+rs);
        // 출력 : rs : true
    }
}

class Math {
    static boolean isPrimeNumber(int i) {
        int c = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                c++;
            }
        }
        return c ==2;
    }
}

