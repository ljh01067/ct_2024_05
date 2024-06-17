package clas.d0617six;

import static clas.d0617six.Math.one_to_n_prime_numbers_count;

class Main {
    public static void main(String[] args) {

        int rs = one_to_n_prime_numbers_count(10);
        System.out.println("rs : " + rs);
        // 출력 : rs : 4

        rs = one_to_n_prime_numbers_count(13);
        System.out.println("rs : " + rs);
        // 출력 : rs : 6
    }
}

class Math {
    static int one_to_n_prime_numbers_count(int a) {
        int cut = 0;
        for(int i=1;i<=a;i++) {
            int c = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if(c == 2){
                cut++;
            }
        }
        return cut;
    }
}

