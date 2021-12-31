package com.example.demo.Core;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

import com.example.demo.Persistence.ArrayRidesPersistence;
import com.example.demo.Persistence.ArrayUsersPersistence;
import com.example.demo.Persistence.RidesPersistence;
import com.example.demo.Persistence.UsersPersistence;

public class Customer extends user implements observer {
    private UsersPersistence userM = new ArrayUsersPersistence();
    private RidesPersistence persistence = new ArrayRidesPersistence();
    int id;
    
    public Customer(String userName,String password,String email,String mobileNum){
        this.userName=userName;
        this.password=password;
        this.email=email;
        this.mobileNum=mobileNum;
    }
    public boolean Rating(Ride r ,Double rate){
       return r.setRate(rate);
    }
    // public void setUsername(String username) {
    //     this.userName = username;
    // }

    // public void setPassword(String password) {
    //     this.password = password;
    // }

    // public void setEmail(String email) {
    //     this.email = email;
    // }

    // public void setMobileNum(String mobileNum) {
    //     this.mobileNum = mobileNum;
    // }

    public Customer() {}
    public void setId(int id){
        this.id= id;
    }
    public int getId(){
        return id;
    }
    public String getuserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public String getmobileNum() {
        return mobileNum;
    }
    public ArrayList <Ride> getHistory(){
        return persistence.getEndedRides();
    } 
    public ArrayList <Integer> getOffers(){
        return userM.getOffers();
    }  
  
    @Override
    public void update(ArrayList<Integer> arrayList) {
            System.out.println("My offer is "+arrayList.get(arrayList.size()-1)+" for "+ getuserName());
    }
}


