package com.example.demo.application;

import java.util.List;
import com.example.demo.Core.Ride;

public interface IRidesService {
    boolean add(Ride ride);
    
    Ride get(int id);

    List<Ride> getAll();

    boolean deleteRide(int id);
}
