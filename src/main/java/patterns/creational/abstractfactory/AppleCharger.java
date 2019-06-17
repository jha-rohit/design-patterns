package main.java.patterns.creational.abstractfactory;

/**
 * Created by rohit.jh on 18/06/19
 */

public class AppleCharger implements Charger {
    @Override
    public void chargePhone() {
        System.out.println("Using Apple charger");
    }
}
