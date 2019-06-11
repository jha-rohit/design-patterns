package main.java.patterns.structural.adapter;

/**
 * Created by rohit.jh on 11/06/19
 */

public class Main {

    public static void main(String[] args) {
        TwoPinSocket twoPinSocket = new TwoPinSocket();

        twoPinSocket.plugTwoPinDevice(new PhoneCharger());
        twoPinSocket.plugTwoPinDevice(new Trimmer());

        //Able to use three pin device in two pin socket with adapter
        twoPinSocket.plugTwoPinDevice(new ThreePinAdapter(new Fridge()));
        twoPinSocket.plugTwoPinDevice(new ThreePinAdapter(new AirConditioner()));
    }
}
