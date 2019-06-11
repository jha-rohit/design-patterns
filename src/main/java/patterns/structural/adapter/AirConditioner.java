package main.java.patterns.structural.adapter;

/**
 * Created by rohit.jh on 11/06/19
 */
public class AirConditioner implements ThreePinDevice {

    @Override
    public void useThreePinDevice() {
        System.out.println("Using air conditioner");
    }
}
