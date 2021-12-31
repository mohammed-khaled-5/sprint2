package com.example.demo.Core;
public interface subject {
     void registerObserver (observer observer);
     void removeObserver (observer observer);
     void notifyObserver ();
}
