package com.example.demo.Persistence;

import java.util.ArrayList;

import com.example.demo.Core.Customer;
import com.example.demo.Core.Driver;

public interface UsersPersistence {
    public boolean UserRegister(Customer c);
    public void DriverRegister(Driver D);
    public void indexSet(int d);
    public ArrayList<Customer> getCustomer();
    public ArrayList<Driver> getDriver();
    public Driver getOneDriver(int id);
    public int getNextIdForDriver();
    public int getNextIdForCustomer();
    public boolean loginForCustomer(String userName, String password);
    public boolean loginForDriver(String userName, String password);
    public ArrayList<Integer> getOffers();
}
