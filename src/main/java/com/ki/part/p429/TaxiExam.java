package com.ki.part.p429;

public class TaxiExam{
    public static void main(String[] args){
        Taxi taxi = new Taxi();

        taxi.start();
        taxi.afterMidnight();
        taxi.stop(10);
    }
}