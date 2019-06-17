package main.java.patterns.creational.abstractfactory;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Created by rohit.jh on 18/06/19
 */
public class Main {
    public static void main(String[] args) throws InvalidArgumentException {
        AbstractPhoneFactory samsungFactory = AbstractPhoneFactory.getFactory("Samsung");
        samsungFactory.getCharger().chargePhone();
        samsungFactory.getPhone().runPhone();

        AbstractPhoneFactory appleFactory = AbstractPhoneFactory.getFactory("Apple");
        appleFactory.getPhone().runPhone();
        appleFactory.getCharger().chargePhone();
    }
}
