package ex_01_Java_Basics;

public class Lab006_Increment_Operation {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
    }
}

//let A=++a , B=a++ , C=a++
// a=10 --> A= ++a = 11  and a = 11
// a=11 --> B= a++ = 11 and a = 12
// a=12 --> C= a++ = 12 and a = 13
// Exp = A+B+C = 11+11+12 = 34 and a = 13

