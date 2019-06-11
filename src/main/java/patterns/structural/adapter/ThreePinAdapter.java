package main.java.patterns.structural.adapter;

/**
 * Created by rohit.jh on 11/06/19
 */

public class ThreePinAdapter implements TwoPinDevice {

    private ThreePinDevice threePinDevice;

    ThreePinAdapter(ThreePinDevice threePinDevice) {
        this.threePinDevice = threePinDevice;
    }

    @Override
    public void useTwoPinDevice() {
        threePinDevice.useThreePinDevice();
    }
}
