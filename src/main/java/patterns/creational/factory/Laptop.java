package main.java.patterns.creational.factory;

/**
 * Created by rohit.jh on 12/06/19
 */
public class Laptop implements Computer {

    @Override
    public void process() {
        System.out.println("Processing from laptop");
    }
}
