package com.company;
public class Kangaroo extends Mammal{
    int Size=0 ,Speed,Cage;
    String Color,Eat,Name;
    @Override
    public void size() {
        Size=80;
    }
    public void size(int x){
        Size+=x;
    }
    @Override
    public void eat() {
        Eat="Herbivorous";
    }
    @Override
    public void color() {
        Color="Brown";
    }

    @Override
    public void speed() {
        Speed=30;
    }
    public void setNumber_of_legs(int x){
        number_of_legs=x;
    }
    public void setNumber_of_legs(){
        number_of_legs=2;
    }
    public void setCovering(String cover){
        Covering=cover;
    }
    public void setCovering(){
        Covering="Leather";
    }
    public void cage(){
        Cage=4;
    }
    public void set_name(){
        Name="...DefaultKangaroo...";
    }
    public void set_name(String name)
    {
        Name=name;
    }
    Kangaroo(){
        set_name();
        size();
        eat();
        color();
        speed();
        cage();
        setCovering();
        setNumber_of_legs();
        System.out.println("<< Default kangaroo has been created! >>");
    }
    Kangaroo(String name, int sz,int legs , String cover){
        set_name(name);
        size(sz);
        eat();
        color();
        speed();
        cage();
        setCovering(cover);
        setNumber_of_legs(legs);
        System.out.println("<< Custom kangaroo '" + Name + "' has been created! >>");
    }
    Kangaroo(String name){
        set_name(name);
        size();
        eat();
        color();
        speed();
        cage();
        setCovering();
        setNumber_of_legs();
        System.out.println("<< Default kangaroo '" + Name + "' has been created! >>");
    }
    public void print_details() {
        System.out.println("The kangaroo named " + Name + " is found in cage " + Cage + " it is covered with " + Covering + " color " + Color);
        System.out.println("can run at an average speed of " + Speed + " Km/h, weights " + Size + " Kg, has " + number_of_legs + " and eats " + Eat + "\n");
    }
}
