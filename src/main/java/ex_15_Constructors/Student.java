package ex_15_Constructors;

public class Student{
    String name;
    int marks;
    String status;
    String grade;
    public Student(String name,int marks){
        this.name=name;
        this.marks=marks;
        System.out.println(name + " : "+ marks + " marks ");

    }
    public Student(String name,int marks,String status){
        this.status=status;
        System.out.println(name + " : "+marks + " marks --> "+ " status : " + status);
    }

    public Student(String name,String grade){
        this.name=name;
        this.grade=grade;
        System.out.println(name + " : grade --> "+ grade);
    }
}
