package ex_01_Java_Basics;

public class Lab007_IncrementnDecrement_Operation {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);
    }
}
//let A=--a , B=a++ , C=a--
// a=20 --> A= --a = 19  and a = 19
// a=19 --> B= a++ = 19 and a = 20
// a=20 --> C= a-- = 20 and a = 19
// Exp = A+B+C = 19+20+19 = 58  and a = 19