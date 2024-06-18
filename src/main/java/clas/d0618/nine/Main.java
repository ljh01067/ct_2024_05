package clas.d0618.nine;
//올바른 리턴타입으로 메서드를 만들어주세요
public class Main {
    public static void main(String[] args) {
        int i = 로봇.get정수();
        boolean b = 로봇.get논리();
        사람 a사람 = 로봇.get사람();
        사람 a사람2 = 로봇.get사람2();
        사람 a사람3 = 로봇.get사람3();
        사람 a사람4 = 로봇.get사람4();
        사람 a사람5 = 로봇.get사람5(123,false);
        로봇.get사람6(123,false);

    }
class 로봇{
        int 정수;
        boolean 논리;
        public void get정수(int a){
            this.정수 = a;
        }
        public void get논리(boolean b){
            this.논리 = b;
        }
        public void get사람(int a,boolean b){
            System.out.println(a);
            System.out.println(b);
        }
    public void get사람2(){
        System.out.println(a);
        System.out.println(b);
    }
    public void get사람3(){
        System.out.println(a);
        System.out.println(b);
    }
    public void get사람4(){
        System.out.println(a);
        System.out.println(b);
    }
    public void get사람5(){
        System.out.println(a);
        System.out.println(b);
    }
    public void get사람6(){
        System.out.println(a);
        System.out.println(b);
    }
}

}