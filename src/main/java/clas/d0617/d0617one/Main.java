package clas.d0617.d0617one;

import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String msg = greet("lin"); // 문자열만 담을 수 있는 변수 msg에 greet함수 실행결과를 넣는다.
        System.out.println(msg); // 앞줄의 msg변수를 출력한다.

        Point point = createPoint(5,10); // createPoint메소드의 x,y변수에 각각 5,10을 넣는다.
        System.out.println("Point create at ("+point.x+", "+point.y+")"); // Point create at (뒤에 앞줄의 point변수를 ,기준으로 출력한다 마지막은 )로 마무리한다.

        int[] evens = firstNEvenNumbers(5); // firstNEvenNumbers메소드의 n변수에 5를 넣는다.
        System.out.println("first 5 even numbers : "+ Arrays.toString(evens)); // first 5 even numbers :  뒤에 앞줄의 evens배열을 출력한다.
    }
    public static String greet(String name){ // greet메소드를 만든다.
        return "Hello, " + name + "!"; //Hello, 다음에 8line의 변수값을 넣고 마지막으로!를 넣은다음에 반환한다.
    }
    public static Point createPoint(int x,int y){ // createPoint메소드를 만든다.
        return new Point(x,y); // 11line의 변수값을 넣고 반환한다.
    }
    public static int[] firstNEvenNumbers(int n){ // firstNEvenNumbers메소드를 만든다.
        int[] evenNumbers = new int[n]; // evenNumbers이라는 배열을 만든다. 이때, 공간은 8line의 변수값을 넣는다.
        for(int i = 0, num = 2;i<n;i++, num+=2){ //i를 0 그리고 num을 2로 두고 i가 n보다 작을 때까지만 안의 식들을 반복한다. 반복할 때마다 i는 1씩 num은 2씩 증가한다.
            evenNumbers[i] = num;//evenNumbers이라는 배열의 0부터 i(n-1)까지의 번호에 2부터 +2씩늘어나는 num값을 삽입한다.
        }
        return evenNumbers; //evenNumbers을 반환한다.
    }
}
