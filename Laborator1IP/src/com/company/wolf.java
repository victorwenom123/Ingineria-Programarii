package com.company;
public class wolf extends  Mammal{
    int Size ,Speed, Cage;
    String Color,Eat, Name;
    @Override
    public void size() {
        Size=10;
    }
    public void size(int x){
        Size=x;
    }
    @Override
    public void eat() {
        Eat="Meat";
    }
    @Override
    public void color() {
        Color="Grey";
    }

    @Override
    public void speed() {
        Speed=15;
    }

    @Override
    public void cage() {
        Cage=1;
    }
    public void change_cage(int cage){
        Cage=cage;
    }
    public void setNumber_of_legs(int x){
        number_of_legs=x;
    }
    public void setNumber_of_legs(){
        number_of_legs=4;
    }
    public void setCovering(String cover){
        Covering=cover;
    }
    public void setCovering(){
        Covering="Fur";
    }
    public void set_name(){
        Name="...DefaultWolf...";
    }
    public void set_name(String name)
    {
        Name=name;
    }
    wolf(){
        set_name();
        size();
        eat();
        color();
        speed();
        cage();
        setCovering();
        setNumber_of_legs();
        System.out.println("<< Default wolf has been created! >>");
    }
    wolf(String name, int sz,int legs , String cover){
        set_name(name);
        size(sz);
        eat();
        color();
        speed();
        cage();
        setCovering(cover);
        setNumber_of_legs(legs);
        System.out.println("<< Custom wolf '" + Name + "' has been created! >>");
    }
    wolf(String name){
        set_name(name);
        size();
        eat();
        color();
        speed();
        cage();
        setCovering();
        setNumber_of_legs();
        System.out.println("<< Default wolf '" + Name + "' has been created! >>");
    }
    @Override
    public void print_details() {
        System.out.println("The wolf named " + Name + " is found in cage " + Cage + " it is covered with " + Covering + " color " + Color);
        System.out.println("can run at an average speed of " + Speed + " Km/h, weights " + Size + " Kg, has " + number_of_legs + "legs and eats " + Eat + "\n");
    }
}