package clas.d0617.d0617five;

//n부터 m까지의 합을 반환하는 함수
class Main {
    public static void main(String[] args) {
        int 결과1 = Math.nToMSum(2, 3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 5

        int 결과2 = Math.nToMSum(5, 10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 45
    }
}

class Math {

    static int nToMSum(int a,int b) {
        for(int i=a+1;i<=b;i++){
            a = a + i;
        }
        return a;
    }
}
