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

        //me.getSalary();
        me.setSalary(1405.12);
        //me.setSalary(-10.1);
        //me.setSalary(3948448.49);
        me.getSalary();

        //myCar.ofkoz = 1300.20;

        Car fiat = new Car();
        fiat.ofkoz = 1300.20;
        fiat.model = "bravo";

        me.setSalary(2000.20);
        me.setCar(fiat);
        System.out.println(me.getCar().model);

        /*public class Human extends Animal{
            String species;
            String name;
            Integer weight;
            Integer age;
            Boolean alive;
        }*/

        /*dog.takeForWalk();
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
*/
    }
}
