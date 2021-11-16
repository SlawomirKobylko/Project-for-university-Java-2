package com.company.devices;

public class Device {
    String producer;
    String model;
    Integer yearOfProduction;
    Double value;


    public String toString(){
        return "Producer: " + this.producer + " model " + this.model;
    }
    //abstract public void turnOn();
}
