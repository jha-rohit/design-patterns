package main.java.patterns.creational.builder;

/**
 * Created by rohit.jh on 18/06/19
 */
class UserBuilder {
    private User user;

    UserBuilder(String firstName) {
        this.user = new User(firstName);
    }

    UserBuilder lastName(String lastName) {
        user.setLastName(lastName);
        return this;
    }

    UserBuilder age(int age) {
        user.setAge(age);
        return this;
    }

    UserBuilder address(String address) {
        user.setAddress(address);
        return this;
    }

    UserBuilder contactNo(String contactNo) {
        user.setContactNo(contactNo);
        return this;
    }

    User build() {
        return this.user;
    }
}
