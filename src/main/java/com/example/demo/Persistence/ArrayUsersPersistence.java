package com.example.demo.Persistence;

import java.util.ArrayList;

import com.example.demo.Core.Customer;
import com.example.demo.Core.Driver;

public class ArrayUsersPersistence implements UsersPersistence {
    ArrayList<Integer> index = new ArrayList<Integer>();
    ArrayList<Integer> offersList = new ArrayList<Integer>();
    ArrayList<Driver> Driverlist = new ArrayList<Driver>();
    ArrayList<Customer> Customerlist = new ArrayList<Customer>();

    public boolean UserRegister(Customer c) {
        return Customerlist.add(c);
    }

    public void DriverRegister(Driver D) {
        Driverlist.add(D);
    }

    public void indexSet(int d) {
        index.add(d);
    }

    public ArrayList<Customer> getCustomer() {
        return Customerlist;
    }

    public ArrayList<Driver> getDriver() {
        return Driverlist;
    }
    public ArrayList<Integer> getOffers() {
        return offersList;
    }
    public Driver getOneDriver(int id) {
        return Driverlist.get(id);
    }
    public int getNextIdForDriver() {
        return Driverlist.size();
    }
    public int getNextIdForCustomer() {
        return Customerlist.size();
    }
    

    public boolean loginForCustomer(String userName, String password) {
        for (int i = 0; i < Customerlist.size(); i++) {
            if (getCustomer().get(i).getuserName().equals(userName) && password.equals(getCustomer().get(i).getPassword()))
                return true;
        }
        return false;
    }

    public boolean loginForDriver(String userName, String password) {

        for (int i = 0; i < Driverlist.size(); i++) {
            if (getDriver().get(i).getVerify() == "True") {
                if (getDriver().get(i).getuserName().equals(userName) && getDriver().get(i).getPassword().equals(password)) {
                    return true;
                }
            } else {
                System.out.println("you should wait until the admin accept your request");
            }
        }
        return false;

    }
}