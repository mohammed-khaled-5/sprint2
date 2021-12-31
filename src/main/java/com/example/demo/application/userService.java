package com.example.demo.application;

import java.util.List;

import com.example.demo.Core.Customer;
import com.example.demo.Core.Driver;
import com.example.demo.Core.admin;
import com.example.demo.Persistence.ArrayUsersPersistence;
import com.example.demo.Persistence.UsersPersistence;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

public class userService implements IuserService {
    private UsersPersistence userM = new ArrayUsersPersistence();
    admin a = new admin();

    public boolean addCustomer(Customer c){
        c.setId(userM.getNextIdForCustomer());
        userM.UserRegister(c);
        return true;
    }
    public boolean CustomerLogin(String username,String pass){
        return userM.loginForCustomer(username, pass);  
    }
    public boolean DriverLogin(String username,String pass){
        return userM.loginForDriver(username, pass);  
    }
    public List<Customer> getAllCustomers() {
        return userM.getCustomer();
    }
   
    public boolean adddriver(Driver d) {
        d.setId(userM.getNextIdForDriver());
        userM.DriverRegister(d);
        return true;
    }
    public List<Driver> getAllDrivers() {
        
        return userM.getDriver();
    }
    public Driver getOneDriver(int id) {
       
        return userM.getOneDriver(id);
    }
    public boolean verifyRegistration(int id) {
        return a.verifyRegistration(id,userM);
    }
    public boolean FavArea(String[] arr , int id) {
       return userM.getDriver().get(id).setFavArea(arr);
    }

    
    
}
