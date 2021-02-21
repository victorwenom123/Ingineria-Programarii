package com.company;
public class whiteWolf extends wolf{
    public void size() {
        Size=12;
    }
    public void eat() {
        Eat="raw Meat";
    }
    public void color() {
        Color="White";
    }
    public void speed() {
        Speed=17;
    }
    public void cage() {
        Cage=2;
    }
    whiteWolf(){
        set_name();
        size();
        eat();
        color();
        speed();
        cage();
        setCovering();
        setNumber_of_legs();
        System.out.println("<< Default white wolf has been created! >>");
    }
    whiteWolf(String name) {
        set_name(name);
        size();
        eat();
        color();
        speed();
        cage();
        setCovering();
        setNumber_of_legs();
        System.out.println("<< White wolf '" + Name + "' has been created! >>");
    }
    public void print_details(){
        System.out.println("The white wolf named " + Name + " is found in cage " + Cage + " it is covered with " + Covering + " color " + Color);
        System.out.println("can run at an average speed of " + Speed + " Km/h, weights " + Size + " Kg, has " + number_of_legs + " and eats " + Eat + "\n");
    }
}
