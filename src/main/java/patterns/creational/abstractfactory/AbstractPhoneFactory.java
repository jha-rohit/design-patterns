package main.java.patterns.creational.abstractfactory;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Created by rohit.jh on 18/06/19
 */

abstract class AbstractPhoneFactory {

    private static final AbstractPhoneFactory samsungFactory = new SamsungFactory();
    private static final AbstractPhoneFactory appleFactory = new AppleFactory();

    public abstract Charger getCharger();

    public abstract Phone getPhone();

    public static AbstractPhoneFactory getFactory(String name) throws InvalidArgumentException {
        switch (name) {
            case "Samsung":
                return samsungFactory;
            case "Apple":
                return appleFactory;
            default:
                throw new InvalidArgumentException(new String[]{});
        }
    }
}
