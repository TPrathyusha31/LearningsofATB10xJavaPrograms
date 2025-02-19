package ex_15_Constructors;

import java.util.Scanner;

public class Lab072_Param_constructor {
    public static void main(String[] args) {

        Chocolate milkybar = new Chocolate("milkybar",20);
        Chocolate dairymilk = new Chocolate("dairymilk",50);
        milkybar.display();
        dairymilk.display();
    }
}
