package main.java.patterns.creational.factory;

/**
 * Created by rohit.jh on 12/06/19
 */

public class ComputerFactory {
    public Computer getComputer(String type) {
        switch (type) {
            case "LAPTOP":
                return new Laptop();
            case "MINI":
                return new MiniComputer();
            case "MICRO":
                return new MicroComputer();
            default:
                throw new ClassCastException();
        }
    }
}
