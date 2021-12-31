package com.example.demo.Core;
import java.util.ArrayList;
import java.util.Arrays;

public class Driver extends user implements observerr {
    String nationalID;
    String license;
    String verify="True";
    String[] favArea ={};
    int id;
//    int Balance;
    public Driver(String userName,String password,String email,String mobileNum,String nationalID,String license){
        this.userName=userName;
        this.password=password;
        this.email=email;
        this.mobileNum=mobileNum;
        this.nationalID=nationalID;
        this.license=license;
    }
    public void setVerify(String verify){
        this.verify=verify;
    }
    public boolean setFavArea(String[] favArea) {
        this.favArea = favArea;
        return true;
    }
    
    public void setId(int id){
        this.id= id;
    }
    public int getId(){
        return id;
    }
    
    public String getVerify() {
        return verify;
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
    public String getNationalID() {
        return nationalID;
    }
    public String getLicense() {
        return license;
    }
    public String[] getFavArea() {
        return favArea;
    }
    public void notifyDriver(String source){
        boolean check = Arrays.asList(favArea).contains(source);
        if(check){
            System.out.println("there is someone requested a ride in the "+source + " area and you added this area in your favourite areas");
        }
    }
    @Override
    public void update(ArrayList<FavArea> arrayList) {
        // TODO Auto-generated method stub
        
    }
}