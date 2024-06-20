package clas.d0620.five;

public class Main {
    public static void main(String[] args) {
        사람 a사람1 = new 사람("김철수",22);
        사람 a사람2 = new 사람("홍길동",23);

        System.out.println(a사람1);
        System.out.println(a사람2);
    }
}
class 사람 extends Object{
    String name;
    int age;

    @Override
    public String toString() {
        return "사람{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    사람(String name, int age) {
        this.name = name;
        this.age = age;
    }
}