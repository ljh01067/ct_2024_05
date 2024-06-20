package clas.d0620.six;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("철수",20);
        map.put("영희",22);
        map.put("영수",33);

        System.out.println("철수 나이 : "+map.get("철수"));
        System.out.println("영희 나이 : "+map.get("영희"));
        System.out.println("영수 나이 : "+map.get("영수"));

        List<Integer> ages = new ArrayList<>();
        ages.add(20);
        ages.add(22);
        ages.add(33);

//        ages.remove(1);
//        ages.add(1,55);

        System.out.println("철수 나이 : "+ages.get(0));
        System.out.println("영희 나이 : "+ages.get(1));
        System.out.println("영수 나이 : "+ages.get(2));
    }
}