package com.example.demo.Core;

import java.util.ArrayList;

import com.example.demo.Persistence.ArrayUsersPersistence;
import com.example.demo.Persistence.UsersPersistence;

public class admin {
    ArrayList<Driver> pendingReq = new ArrayList<Driver>();

    public void listPendingReq(Driver d) {
        if (d.getVerify() == "False") {
            pendingReq.add(d);
        }
    }

    public boolean verifyRegistration(int id, UsersPersistence um) {
        for (int i = 0; i < um.getDriver().size(); i++) {
            um.getOneDriver(id).setVerify("True");
            System.out.println("THE ADMIN ACCEPT YOUR REQUEST YOU CAN LOGIN NOW");
            pendingReq.remove(id);
            return true;
        }
        return false;

    }
}
