package ex_09_Task_1st_Feb_2025;

import java.util.Scanner;

public class Lab041_Senior_Citizen_basedOn_age {
    public static void main(String[] args) {
//        take the age input from the user.
//        Implement Age Category Logic:
//        Define the criteria for different age categories:
//        Child: Age 0 to 12
//        Teenager: Age 13 to 19
//        Adult: Age 20 to 64
//        Senior Citizen: Age 65 and older
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = 0;
        if(sc.hasNextInt()) {
            age = sc.nextInt();
        }else{ // if user enters input as any string value or special character
            System.out.println("Please enter only integer value of age");
            System.exit(0);
        }
        if( age>=0 && age<= 12){
            System.out.println("Child");
        }else if( age>=13 && age<= 19){
            System.out.println("Teenager");
        }else if( age>=20 && age<= 64){
            System.out.println("Adult");
        }else if(age >65) {
            System.out.println("Senior Citizen");
        } else{  // if user enters negative value of age
            System.out.println("Please enter a valid age value above zero.");
        }
        sc.close();
    }
}
