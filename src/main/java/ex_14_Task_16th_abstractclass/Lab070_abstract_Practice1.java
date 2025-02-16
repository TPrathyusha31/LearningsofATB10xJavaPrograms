package ex_14_Task_16th_abstractclass;

public class Lab070_abstract_Practice1 {
    public static void main(String[] args) {
        Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", "120");
        myBook.getDetails();
    }
}
abstract class Book{
    abstract void getDetails();
}

class PrintMyBook extends Book{
    String name;
    String author;
    String price;
   public PrintMyBook(String name,String author, String price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    @Override
    void getDetails(){
        System.out.println(name + " ,"+author + " ,"+price);
   }

}