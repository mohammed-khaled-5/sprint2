package com.example.demo.application;

import java.util.List;

import com.example.demo.Core.Customer;
import com.example.demo.Core.Driver;

public interface IuserService {
    public boolean addCustomer (Customer c);
    public List<Customer> getAllCustomers();
    public boolean adddriver (Driver d);
    public List<Driver> getAllDrivers();
    public boolean CustomerLogin(String username,String pass);
    public boolean DriverLogin(String username,String pass);
    public Driver getOneDriver(int id);
    public boolean verifyRegistration(int id);
    public boolean FavArea(String[] arr , int id);
}
