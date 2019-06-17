package main.java.patterns.creational.abstractfactory;

/**
 * Created by rohit.jh on 18/06/19
 */

public class SamsungFactory extends AbstractPhoneFactory{
    @Override
    public Charger getCharger() {
        return new SamsungCharger();
    }

    @Override
    public Phone getPhone() {
        return new SamsungPhone();
    }
}
