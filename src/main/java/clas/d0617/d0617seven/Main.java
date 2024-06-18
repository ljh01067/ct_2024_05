package clas.d0617.d0617seven;

import static clas.d0617.d0617seven.Math.isEvenNumber;

class Main {
    public static void main(String[] args) {

        boolean rs = isEvenNumber(2);
        System.out.println(rs);
        // 출력 : rs : true

        rs = isEvenNumber(3);
        System.out.println(rs);
        // 출력 : rs : false
    }
}

class Math {
    static boolean isEvenNumber(int i) {
        return i%2 == 0;
    }
}

