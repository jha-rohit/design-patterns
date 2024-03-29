package main.java.patterns.creational.factory;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Created by rohit.jh on 12/06/19
 */

public class Main {
    public static void main(String[] args) throws InvalidArgumentException {
        ComputerFactory computerFactory = new ComputerFactory();

        computerFactory.getComputer("LAPTOP").process();
        computerFactory.getComputer("MINI").process();
        computerFactory.getComputer("MICRO").process();
    }
}
