package main.java.patterns.creational.builder;

/**
 * Created by rohit.jh on 18/06/19
 */

public class Main {
    public static void main(String[] args) {
        User user = new UserBuilder("John")
                .lastName("Doe")
                .age(19)
                .address("XYZ")
                .contactNo("123")
                .build();

        System.out.println(user.toString());
    }
}
