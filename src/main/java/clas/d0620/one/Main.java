package clas.d0620.one;

public class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.setId(20);
        a사람.setAge(20);

        System.out.println("번호 : "+a사람.getId());
        System.out.println("나이 : "+a사람.getAge());
    }
}
class 사람{
    private int id;
    private int age;

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;

    }
    public int getId() {
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
}
