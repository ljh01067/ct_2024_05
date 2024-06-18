package clas.d0617.d0617four;

//1부터 n까지의 합을 반환하는 함수
class Main {
    public static void main(String[] args) {

        int 결과1 = Math.oneToSum(3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 6

        int 결과2= Math.oneToSum(10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 55
    }
}

class Math {
    // static => 본사직원
    // static은 현재 클래스에 지금당장 존재한다.
    static int oneToSum(int a) {
        // 메인 메서드의 int c와 아래 int c는 전혀 관계가 없다.

        int c = 0;
        for(int i=0;i<=a;i++){
            c = c + i;
        }

        // return 값의 타입과 함수명의 앞부분이 같아야 한다.
        // return => 변신
        return c;
    }
}

