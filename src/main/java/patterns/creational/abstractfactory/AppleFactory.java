package main.java.patterns.creational.abstractfactory;

/**
 * Created by rohit.jh on 18/06/19
 */

public class AppleFactory extends AbstractPhoneFactory{
    @Override
    public Charger getCharger() {
        return new AppleCharger();
    }

    @Override
    public Phone getPhone() {
        return new ApplePhone();
    }
}
