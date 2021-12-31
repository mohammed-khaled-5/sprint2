package com.example.demo.Persistence;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Core.Ride;

public class ArrayRidesPersistence implements RidesPersistence {

    ArrayList<Ride> allRides = new ArrayList<Ride>();
    ArrayList<Ride> History = new ArrayList<Ride>();
    @Override
    public int getNextId() {
        return allRides.size();
    }

    @Override
    public boolean add(Ride ride) {
        return allRides.add(ride);
    }

    public ArrayList<Ride> getEndedRides() {
        return History;
    }

    public void setEndedRides(Ride  r) {
        History.add(r);
    }

    @Override
    public Ride get(int id) {
        for (Ride ride : allRides) {
            if (ride.getId() == id) {
                return ride;
            }
        }
        return null;
    }

    @Override
    public List<Ride> getAll() {
        return allRides;
    }

    @Override
    public boolean EndRide(int id) {
        for (Ride ride : allRides) {
            if (ride.getId() == id) {
                return allRides.remove(ride);
            }
        }

        return false;
    }

}