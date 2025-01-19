package ex_01_Java_Basics;

public class Lab004_GradeCalculator_ternaryoperator {
    public static void main(String[] args) {
        int score= 70;
       String grade= (score<=100 && score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"E";
        System.out.println(grade);
    }

}
//Another way--->
// String grade = (score>=90 && score<=100)?"A":(score>=80 && score<=89)?"B":(score>=70 && score<=79)?"C":(score>=60 && score<=69)?"D":"E";