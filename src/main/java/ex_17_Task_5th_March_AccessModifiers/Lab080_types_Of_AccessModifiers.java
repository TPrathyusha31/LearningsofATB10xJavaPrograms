package ex_17_Task_5th_March_AccessModifiers;

public class Lab080_types_Of_AccessModifiers {
    public static void main(String[] args) {
        accessModifiers am = new accessModifiers();
        // System.out.println(privateVar);  Not accessible (private)
        System.out.println(am.defvariable);   //  Accessible (same package)
        System.out.println(am.provariable); // Accessible (subclass)
        System.out.println(am.pubvariable);    // Accessible (public)

        // privateMethod();  Not accessible (private)
        am.defaultMethod();  //  Accessible (same package)
        am.protectedMethod(); // Accessible (subclass)
        am.publicMethod();    //  Accessible (public)

        Child child = new Child();
        child.display();


    }
}

class accessModifiers{
        public String pubvariable = "Public"; //Accessible everywhere
    protected String provariable = "Protected"; //Accessible within the package and in subclasess
    private String privariable = "Private"; //Accessible only within the accessModifiers calss
    String defvariable = "Default"; //Accessible only within the same package

    public void publicMethod(){
        System.out.println("It is a public Method and the public variable is ----> " + pubvariable);
    }

    private void privateMethod(){
        System.out.println("It is a private Method and the private variable is ----> " + privariable);
    }
    // Method to call privateMethod (Since private methods are not directly accessible)
    public void accessPrivateMethod(){
        privateMethod(); //calling private method inside the public method of same class
    }
    protected void protectedMethod(){
        System.out.println("It is a protected Method and the protected variable is ----> " + provariable);
    }

    void defaultMethod(){
        System.out.println("It is a default Method and the default variable is ----> " + defvariable);
    }

}

    // Subclass (Child Class) in the Same Package
    class Child extends accessModifiers{
        void display() {
            // System.out.println(privateVar);  Not accessible (private)
            System.out.println(defvariable);   //  Accessible (same package)
            System.out.println(provariable); // Accessible (subclass)
            System.out.println(pubvariable);    // Accessible (public)

            // privateMethod();  Not accessible (private)
            defaultMethod();   //  Accessible (same package)
            protectedMethod(); // Accessible (subclass)
            publicMethod();    //  Accessible (public)
        }
    }