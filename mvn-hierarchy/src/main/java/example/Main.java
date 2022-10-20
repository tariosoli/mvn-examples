package example;

public class Main {
    public static void main(String[] args) {
        String notExistInOldJava = "Value";
        if(!notExistInOldJava.isBlank()) {
            System.out.println("We reached this line");
        }
    }
}