package com.example.demo.Core;

import java.util.ArrayList;

public interface subjectt {
     ArrayList <observerr> listOfobservers = new  ArrayList <observerr>();
     void registerObserver (observer observer);
     void removeObserver (observer observer);
     void notifyObserver ();
}
