package clas.d0621.one;

// 문제 : 아래가 실행되도록 해주세요.
// 조건 : 배열을 사용할 수 없습니다.

import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.
    }
}
class 사람인력관리소{
    Map<Integer,사람> namebook = new HashMap<>();
    int lastnum = 0;

    void add사람(String name, int age) {
        int number = lastnum + 1;
        사람 a사람 = new 사람();
        a사람.number = number;
        a사람.name = name;
        a사람.age = age;
        namebook.put(number,a사람);
        lastnum++;
        }
    사람 get사람(int number){
        return namebook.get(number);
    }
}

class 사람 extends 사람인력관리소{
    int number;
    String name;
    int age;
    public void 자기소개(){
        System.out.println("저는 "+number+"번, "+name+", "+age+"살 입니다.");
    }
}