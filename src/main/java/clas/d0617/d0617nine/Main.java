package clas.d0617.d0617nine;

import static clas.d0617.d0617nine.Math.one_to_n_prime_numbers_sum;

class Main {
    public static void main(String[] args) {

        int rs = one_to_n_prime_numbers_sum(10);
        System.out.println("rs : " + rs);
        // 출력 : rs : 17

        rs = one_to_n_prime_numbers_sum(13);
        System.out.println("rs : " + rs);
        // 출력 : rs : 41
    }
}

class Math {
    static int one_to_n_prime_numbers_sum(int a) {
        int sum = 0;
        for(int i=1;i<=a;i++) {
                if (isPrimeNumber(i)) {
                    sum+=i;
            }
        }
        return sum;
    }
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

