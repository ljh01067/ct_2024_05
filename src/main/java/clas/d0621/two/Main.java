package clas.d0621.two;

// 문제 : 아래가 실행되도록 해주세요.
// 조건 : 배열을 사용할 수 없습니다.

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 : ");
        int a = 0;

        while(true) {
            try {
                a = sc.nextInt();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("숫자 제대로 입력해");
            }
        }
        System.out.printf("입력된 숫자 : %d\n", a);
        sc.close();
    }
}
