package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        String testJava11 = "Value";

        if(!testJava11.isBlank()) {
            System.out.println("We reach here if the compiler will be fine with the line above");
        }
    }
}
