package test;

public class ExampleClass {
    public void exampleFunc() {
        String notExistInOldJava = "Value";
        if(!notExistInOldJava.isBlank()) {
            System.out.println("We reached this line");
        }
    }
}
