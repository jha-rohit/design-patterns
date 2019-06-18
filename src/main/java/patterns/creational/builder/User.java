package main.java.patterns.creational.builder;

/**
 * Created by rohit.jh on 18/06/19
 */
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String contactNo;

    User(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "First Name : " + this.firstName + "\nLast Name : " + this.lastName + "\nAge : " + age + "\nAddress : " + address
                + "\nContact No : " + contactNo;
    }
}
