package com.company;
public class HammerShark extends Shark{
    public void size()
    {
        Size=20;
    }
    public void color()
    {
        Color="blue";
    }
    public void information()
    {
        System.out.println(Size + " kg " + Color + " hammershark");
    }
    public void information(int x)
    {
        x*=Size;
        System.out.println(x + Color + "hammershark");
    }
    public void cage() {
        Cage = 7;
    }
    public void set_name() {
        Name = "...DefaultHammerShark...";
    }
    public void print_details() {
        System.out.println("The HammerShark named " + Name + " is found in cage " + Cage + " it is covered with " + Covering + " color " + Color);
        System.out.println("can fly at an average speed of " + Speed + " Km/h, can reach a depth of " + deep + " m, weights " + Size + " Kg, swims in " + type_of_water + " water, and eats " + Eat + "\n");
    }
    HammerShark() {
        set_name();
        size();
        eat();
        color();
        speed();
        cage();
        deep();
        water_type();
        System.out.println("<< Default HammerShark has been created! >>");
    }
    HammerShark(String name) {
        set_name(name);
        size();
        eat();
        color();
        speed();
        cage();
        deep();
        water_type();
        System.out.println("<< HammerShark " + Name + " has been created! >>");
    }
}
