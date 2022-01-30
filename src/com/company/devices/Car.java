package com.company.devices;

import com.company.Human;

public abstract class Car {
    public String model;
    public String producer;
    public Integer weight;
    public Double cost;
    public Double ofkoz;

//public class Car extends Device import Saleable

    public void turnOn(){
        System.out.println("przekrecam kluczyk");
    }


    public void sale (Human seller, Human buyer, Double price)
    {
        if (buyer.cash >= price){
        System.out.println("KUPUJĄCY MA ZA MAŁO KASY");
    }
        else if (seller.getCar() != null){
        System.out.println("Sprzedający nie ma żadnego auta");
    }
    else if (!seller.getCar().equals(this))
    {
        System.out.println("Sprzedający nie ma żadnego konkretnego auta");
    }
    else
    {
        seller.cash += price;
        buyer.cash -= price;
        seller.car = null;
        buyer.car = this;
        System.out.println("transakcja się udała, kupiono " + this);
    }
    }

    //Zadanie 10
    abstract public void refuel();
}