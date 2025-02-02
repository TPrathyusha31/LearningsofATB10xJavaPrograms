package ex_08_Task_31st_Jan_2025;

import java.util.Scanner;

public class Lab034_Electric_bill_calculation {
    public static void main(String[] args) {
//        take the input from the user of Units.
//       Implement Rate Structure:
//        Define the rate structure for calculating the bill based on the number of units consumed.
//         :-  First 100 units: 0.50Rs per unit
//        :-  Next 100 units (101-200): 0.75Rs per unit
//        :- Next 100 units (201-300): 1.20Rs per unit
//         :- Above 300 units: 1.50Rs per unit
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of units : ");
        double units = 0.0;
        if(sc.hasNextFloat()) {
             units = sc.nextDouble();
        }else{
            System.out.println("Please enter units in float and int value only.");
            System.exit(0);
        }
        double Bill = 0.0,first = 0.0,second = 0.0,third=0.0;
        if(units <= 100){
            Bill = units*0.50;
            System.out.println("Electric bill generated for "+ units + " is : "+ Bill + " rupees");
        } else if (units>100 && units<=200) {
           first = 100*0.50;
           second = (units-100)*0.75;
           Bill = first + second;
            System.out.println("Electric bill generated for "+ units + " is : "+ Bill + " rupees");
        }else if (units>200 && units<=300) {
            first = 100*0.50;
            second = 100*0.75;
            third = (units-200)*1.2;
            Bill = first + second + third;
            System.out.println("Electric bill generated for "+ units + " is : "+ Bill + " rupees");
        }else{
            Bill = units*1.50;
            System.out.println("Electric bill generated for "+ units + " is : "+ Bill + " rupees");
        }
        sc.close();
    }
}
