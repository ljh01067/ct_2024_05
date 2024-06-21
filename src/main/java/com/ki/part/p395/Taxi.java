package com.ki.part.p395;

public class Taxi implements Meter {
    @Override
    public void start() {

    }

    @Override
    public int stop(int distance) {
        return distance*2;
    }
    // Meter인터페이스의 start와 stop메소드를 구현해야 합니다.
}
