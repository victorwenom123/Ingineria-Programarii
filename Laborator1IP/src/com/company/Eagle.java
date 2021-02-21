package com.company;
public class Eagle extends Bird{
    int Size=0 ,Speed , Cage;
    int Height ,Eye;
    String Color,Eat, Name;
    @Override
    public void size() {
        Size=5;
    }
    public void size(int x){
        Size+=x;
    }
    @Override
    public void eat() {
        Eat="Meat";
    }

    @Override
    public void color() {
        Color="Brown";
    }
    @Override
    public void speed() {
        Speed=60;
    }
    public void height(){
        Height=1500;
    }
    public void eyesight(){
        Eye=20000;
    }
    public void cage() {
        Cage=3;
    }
    public void set_name(){
        Name="...DefaultEagle...";
    }
    public void set_name(String name){
        Name=name;
    }
    Eagle(){
        set_name();
        size();
        eat();
        color();
        speed();
        cage();
        height();
        eyesight();
        System.out.println("<< Default Eagle has been created! >>");
    }
    Eagle(String name, int size)
    {
        set_name(name);
        size(size);
        eat();
        color();
        speed();
        cage();
        height();
        eyesight();
        System.out.println("<< Eagle" + Name + " has been created! >>");
    }
    Eagle(String name)
    {
        set_name(name);
        size();
        eat();
        color();
        speed();
        cage();
        height();
        eyesight();
        System.out.println("<< Eagle" + Name + " has been created! >>");
    }
    public void print_details() {
        System.out.println("The Eagle named " + Name + " is found in cage " + Cage + ", it is covered with " + Covering + " color " + Color + ", can see objects at a distance of " + Eye + "m");
        System.out.println("can fly at an average speed of " + Speed + " Km/h, can reach an altitude of " + Height + " m, weights " + Size + " Kg, has " + number_of_legs + " and eats " + Eat + "\n");
    }
}
