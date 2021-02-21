package com.company;
abstract class Mammal implements Animal {
    int number_of_legs;
    String Covering;
    abstract void setNumber_of_legs(int x);
    abstract void setCovering(String cover);
}