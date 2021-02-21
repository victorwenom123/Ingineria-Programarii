package com.company;
import java.util.ArrayList;
import java.io.*;
public class Zoo {
    public ArrayList<Animal> zoo = new ArrayList<Animal>();
    public void animal_add(Animal a)
    {
        zoo.add(a);
    }
    public void print_zoo()
    {
        for(int i=0;i<zoo.size();++i){

            Animal cpy;
            cpy=zoo.get(i);
            cpy.print_details();
        }
    }
    public static void main(String args[])throws FileNotFoundException
    {
        Eagle e = new Eagle();
        Kangaroo k = new Kangaroo();
        Zoo z = new Zoo();
        Eagle e1 = new Eagle("Ceavez");
        whiteWolf ww = new whiteWolf("Colt-alb");
        Shark sh = new Shark("Nemo");
        wolf wo = new wolf("Colt-negru",17,3,"leather");
        HammerShark hs=new HammerShark("Bim");
        z.animal_add(e);
        z.animal_add(k);
        z.animal_add(e1);
        z.animal_add(ww);
        z.animal_add(wo);
        z.animal_add(sh);
        z.animal_add(hs);
        PrintStream o = new PrintStream(new File("output.txt"));
        System.setOut(o);
        z.print_zoo();
        hs.information();
    }
}
