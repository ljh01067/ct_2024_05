package com.ki.part.p369;

public class Car {
    String name;
    int number = 0;
    Car(String name) {
        this.name = name;
    }
    Car(){
        this("이름없음",0);
    }

    Car(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
