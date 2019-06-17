package main.java.patterns.creational.abstractfactory;

/**
 * Created by rohit.jh on 18/06/19
 */

public class SamsungPhone implements Phone{
    @Override
    public void runPhone() {
        System.out.println("Running Samsung phone");
    }
}
