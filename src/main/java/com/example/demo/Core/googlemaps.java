package com.example.demo.Core;

public class googlemaps implements ETAcalculator{
    public void calculateETA(int distance ,int time ,int speed){
        System.out.println("the distance is calculated with google maps is : " + distance);
        System.out.println("the estimate arrival time  is : " + time + " hours" );

    }
}