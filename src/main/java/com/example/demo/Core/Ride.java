package com.example.demo.Core;
import java.util.ArrayList;
import java.util.List;
public class Ride implements subject  {
    ETA eta = new ETA();
    String Sourc,destination;
    Double speed =0.0;
    Double time = 0.0;
    int offer;
    int id;
    Double rate = 0.0;
    private List<observer> listOfObservers = new ArrayList<observer>();
    ArrayList<Integer> listOfOffers = new ArrayList<Integer>();
    public Ride(String Sourc,String destination){
        this.Sourc=Sourc;
        this.destination=destination;
    }
    public void setId(int id){
        this.id= id;
    }
    public void setspeed(Double speed){
        this.speed= speed;
    }
    public void settime(Double time){
        this.time= time;
    }
    public Double getspeed(){
        return speed;
    }
    public Double gettime(){
        return time;
    }
    public void setoffer(int offer){
        this.offer= offer;
    }
    public int getId(){
        return id;
    }
    public String getSourc() {
        return Sourc;
    }
    public String getDestination() {
        return destination;
    }

    public boolean setRate(Double rate) {
        this.rate = rate;
        return true;
    }
    public Double getRate() {
        return rate;
    }
    public void setPrice(int price){
        listOfOffers.add(price);
        notifyObserver();
    }
    public ArrayList<Integer> getPrice(){
        
        return listOfOffers;
    }
    public void acceptedOffer(int offer){
        this.offer=offer;
        System.out.println("the offer that you accepted is: "+offer);
    }
    @Override
    public void registerObserver(observer observer) {
        listOfObservers.add(observer);
        
    }
    @Override
    public void removeObserver(observer observer) {
        listOfObservers.remove(observer);
    }
    @Override
    public void notifyObserver() {
        for (observer observer: listOfObservers)
        {
            observer.update(getPrice());
        }    
    }
}

