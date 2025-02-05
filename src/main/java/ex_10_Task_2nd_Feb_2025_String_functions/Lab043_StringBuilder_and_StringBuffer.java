package ex_10_Task_2nd_Feb_2025_String_functions;

public class Lab043_StringBuilder_and_StringBuffer {
    public static void main(String[] args) {

        // StringBuilder class
        StringBuilder builder = new StringBuilder("Pramod");
        builder.append("Dutta");
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);

        System.out.println("_____________________________________________");

        //StringBuffer class
        StringBuffer buffer = new StringBuffer("Anurag");
        buffer.append("Sharma");
        System.out.println(buffer);
        builder.reverse();
        System.out.println(buffer);

        System.out.println("_____________________________________________");

        //creating a string using normal String datatype.
        String s = "Anshul";
        s.concat("Rathod");
        System.out.println(s); //In this, if you see in output, it only prints Anshul as we are just concatenating rathod to it but not assigning to new variable,So as string is immutable, it will not modify the existing variable s and replace with concatenated one rather it creates a new entry in SCP.
        String s1 =  s.concat("Rathod");
        System.out.println(s1);
        System.out.println(s.concat("Tagore"));

    }
}
