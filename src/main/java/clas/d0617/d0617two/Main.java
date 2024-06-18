package clas.d0617.d0617two;

class Main {
    public static void main(String[] args) {
        계산기.더한결과를_화면에_출력(10, 20);
        // 출력 => 결과 : 30

        계산기.더한결과를_화면에_출력(50, 20);
        // 출력 => 결과 : 70

        계산기.뺀결과를_화면에_출력(50, 20);
        // 출력 => 결과 : 30

        계산기.뺀결과를_화면에_출력(5, 2);
        // 출력 => 결과 : 3

        계산기.곱한결과를_화면에_출력(5, 2);
        // 출력 => 결과 : 10
    }
}
class 계산기 {
    static int 더한결과를_화면에_출력(int a, int b) {
        System.out.println(a+b);
        return a + b;
    }

    static int 뺀결과를_화면에_출력(int a, int b) {
        System.out.println(a-b);
        return a - b;
    }
    static int 곱한결과를_화면에_출력(int a, int b) {
        System.out.println(a*b);
        return a * b;
    }
}
