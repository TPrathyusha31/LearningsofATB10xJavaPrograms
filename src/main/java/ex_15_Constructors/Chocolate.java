package ex_15_Constructors;

import java.util.Scanner;

public class Chocolate{
    String name;
    int price;
    public Chocolate(String name,int price){
        this.name=name;
        this.price=price;
        System.out.println("These are the available chocolates.");
    }



    void display(){

        System.out.println("The name of the chocolate is : " + name + " which costs : " + price + " rupees");
    }
}
