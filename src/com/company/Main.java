package com.company;

public class Main {

    public static void main(String[] args) {
        Integer x = 3;
        Animal dog = new Animal("canis");
        Animal cat = new Animal("felis");

        dog.name = "Szarik";
        dog.weight = 10;
        dog.age = 4;

        System.out.println(dog.name);

        cat.name = "Sierściuch";
        System.out.println("a kot żyje?: "+ cat.alive);
        System.out.println("waga kota: " + cat.weight);
        cat.introduceYourself();
        dog.introduceYourself();

        Integer humanAge = dog.getHumanAge();
        System.out.println("If I'll be human I'll be " +
                + humanAge + " years old");

        Human me = new Human();
        me.firstName = "Slawek";
        me.lastName = "Kobylko";

        me.pet = dog;
        System.out.println("I have a "+ me.pet.species);
        System.out.println("I call it "+ me.pet.name);

        Car myCar = new Car();
        myCar.producer = "Tesla";
        myCar.model = "Model_s";
        myCar.cost = 50.5;
        myCar.weight = 1500;

        System.out.println("I have a "+ myCar.producer + " model "+
                myCar.model + " It's cost "+myCar.cost + " It's weight "
        + myCar.weight);

        dog.takeForWalk();
        System.out.println(dog.weight);

        dog.takeForWalk();
        System.out.println(dog.weight);

        dog.takeForWalk();
        System.out.println(dog.weight);

        dog.takeForWalk();
        System.out.println(dog.weight);

        dog.takeForWalk();
        System.out.println(dog.weight);

        dog.takeForWalk();
        System.out.println(dog.weight);

        dog.takeForWalk();
        System.out.println(dog.weight);

        dog.takeForWalk();
        System.out.println(dog.weight);

        dog.takeForWalk();
        System.out.println(dog.weight);

        dog.takeForWalk();
        System.out.println(dog.weight);

        dog.feed();
        System.out.println(dog.weight);

    }
}
