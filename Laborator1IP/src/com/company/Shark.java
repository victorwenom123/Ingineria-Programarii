package com.company;
public class Shark extends Fish {
    int Size = 0, Speed, deep, Cage;
    String Color, Eat, Name;

    @Override
    public void size() {
        Size = 60;
    }

    @Override
    public void eat() {
        Eat = "Meat";
    }

    @Override
    public void color() {
        Color = "White";
    }

    @Override
    public void speed() {
        Speed = 30;
    }


    public void deep() {
        deep = 5000;
    }

    public void water_type() {
        type_of_water = "salted";
    }

    public void cage() {
        Cage = 5;
    }

    public void set_name() {
        Name = "...DefaultShark...";
    }

    public void set_name(String name) {
        Name = name;
    }

    Shark() {
        set_name();
        size();
        eat();
        color();
        speed();
        cage();
        deep();
        water_type();
        System.out.println("<< Default Shark has been created! >>");
    }

    Shark(String name) {
        set_name(name);
        size();
        eat();
        color();
        speed();
        cage();
        deep();
        water_type();
        System.out.println("<< Shark" + Name + " has been created! >>");
    }

    @Override
    public void print_details() {
        System.out.println("The Shark named " + Name + " is found in cage " + Cage + " it is covered with " + Covering + " color " + Color);
        System.out.println("can fly at an average speed of " + Speed + " Km/h, can reach a depth of " + deep + " m, weights " + Size + " Kg, swims in " + type_of_water + " water, and eats " + Eat + "\n");
    }
}