package com.company;

import com.company.devices.*;
public abstract class Animal {
    String species;
    String name;
    Integer weight;
    Integer age;
    Boolean alive;
    Animal(String species) {
        this.species = species;
        this.alive = true;
        if (this.species == "canis") {
            this.weight = 12;
        } else if (this.species == "felis") {
            this.weight = 2;
        } else {
            this.weight = 1;
        }
    }
    void introduceYourself()
    {
        System.out.println("I'm "+ this.name);
    }
    void doYouLike(String foodType)
    {
        if (this.species == "felis"&&foodType=="mouse")
            System.out.println("yes, I like "+ foodType);
        else
        {
            System.out.println("no ypu idiot");
        }
    }
    Integer getHumanAge()
    {
        if(this.species == "canis")
        {
            return this.age * 7;
        }
        else
        {
            return this.age;
        }
    }

    {
        if (this.alive = false)
        {
            System.out.println("This animal is dead, " +
                    "It' don't have food");
        }
        else
        {this.weight++;}
    }
    void takeForWalk()
    {
        this.weight-=1;
        if (this.weight==0)
        {
            this.alive=false;
            System.out.println("This animal is dead, " +
                    "It's don't take for walk");
        }
        else
        {
            this.alive=true;
        }

    }

    public abstract void feed();
}