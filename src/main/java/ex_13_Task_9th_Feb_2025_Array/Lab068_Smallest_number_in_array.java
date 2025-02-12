package ex_13_Task_9th_Feb_2025_Array;

public class Lab068_Smallest_number_in_array {
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
        for(int i=0;i< numbers.length;i++) {
            System.out.println(numbers[i]);
        }
    }
}
