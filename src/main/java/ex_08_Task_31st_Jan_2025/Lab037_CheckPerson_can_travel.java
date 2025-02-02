package ex_08_Task_31st_Jan_2025;

import java.util.Scanner;

public class Lab037_CheckPerson_can_travel {
    public static void main(String[] args) {
//        take the input from the user for
//        Age (integer).
//        Visa Status (String or boolean).
//        Check Eligibility:
//            :- If age is 18 or older and visa status is valid, the person can travel.
//             Otherwise, the person cannot travel.
//             Validation Criteria
//        Age: - Must be a non-negative integer.
//             :- Should be greater than or equal to 18 to be eligible to travel.
//        Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
//                    :- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();
        System.out.println("Enter the Visa status : ");
        Boolean visa_status = sc.nextBoolean();
        if(age>=18 && visa_status == true){
            System.out.println("You are eligible to travel");
        }else{
            System.out.println("You are not eligible to travel");
        }
        sc.close();
    }
}
