package com.example.demo.Core;

public class FavArea implements subjectt {

    public String name;

    public void setoffer(String name){
        this.name= name;
    }
    public String getId(){
        return name;
    }
    @Override
    public void registerObserver(observer observer) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeObserver(observer observer) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void notifyObserver() {
        // TODO Auto-generated method stub
        
    }
    
}
