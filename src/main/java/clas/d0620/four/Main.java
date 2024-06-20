package clas.d0620.four;

public class Main {
    public static void main(String[] args) {

        String s = "*";
        String k = "*";

        s += "*";
        s += "*";
        s += "*";
        System.out.println(s);

        StringBuilder sb = new StringBuilder();
        sb.append("*");
        sb.append("*");
        sb.append("*");
        System.out.println(sb.toString());
    }
}