package ex_13_Task_9th_Feb_2025_Array;

import java.util.Arrays;

public class Lab069_Second_Smallest_in_array {
    public static void main(String[] args) {
        int[] numbers =  {12,34,10,1,100,3,4,32};
        int temp=0;
        for(int j=0;j<numbers.length-1;j++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                }
            }
        }
        System.out.println("The second smallest number is : " + numbers[1]);

//         Another way -- using sort function
//        Arrays.sort(numbers);
//        System.out.println("The second smallest number is : "+ numbers[1]);
    }
}


