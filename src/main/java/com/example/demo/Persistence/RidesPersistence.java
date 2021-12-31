package com.example.demo.Persistence;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Core.Ride;

public interface RidesPersistence {

    public int getNextId();

    boolean add(Ride ride);

    Ride get(int id);

    List<Ride> getAll();

    boolean EndRide(int id);
    public void setEndedRides(Ride  r);
    public ArrayList<Ride> getEndedRides();

}