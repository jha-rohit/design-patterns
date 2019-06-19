package main.java.patterns.creational.prototype;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Created by rohit.jh on 19/06/19
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, InvalidArgumentException {
        PrototypeFactory prototypeFactory = new PrototypeFactory();
        Movie movie = (Movie) prototypeFactory.getPrototype("movie");
        Song song = (Song)prototypeFactory.getPrototype("song");
    }
}
