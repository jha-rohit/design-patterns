package main.java.patterns.structural.adapter;

/**
 * Created by rohit.jh on 11/06/19
 */

public class Trimmer implements TwoPinDevice {

    @Override
    public void useTwoPinDevice() {
        System.out.println("Using trimmer charger");
    }
}
