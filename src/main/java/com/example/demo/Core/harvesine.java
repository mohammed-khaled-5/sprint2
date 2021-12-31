package com.example.demo.Core;

public class harvesine implements ETAcalculator{

    public void calculateETA(int distance,int time,int speed){
        System.out.println("the distance is calculated with harvesine is : " + distance/speed);
        System.out.println("the estimate arrival time is  : " + time + " hours");
    }
}