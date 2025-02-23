package ex_16_Task_20th_Feb_OOPs;

public class Lab077_AbstractionExample1 {
    public static void main(String[] args) {
     Circle circle = new Circle(4);
     Rectangle rec =new Rectangle(5,6);
     circle.display();
     circle.Area();
     rec.Area();

    }
}
abstract class Shape{
    abstract void Area();
    void display(){
        System.out.println("Non abstract method");
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    public void Area(){
      double circle_area = 3.14*radius*radius;
        System.out.println("Area of circle : " + circle_area);
    }
}

class Rectangle extends Shape{
    int length;
    int breadth;
    Rectangle(int length,int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
       public void Area(){
            int rec_area = length*breadth;
            System.out.println("Area of rectangle :  "+ rec_area);
        }
    }
