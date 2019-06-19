package main.java.patterns.creational.prototype;

/**
 * Created by rohit.jh on 19/06/19
 */
public class Song implements Cloneable {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Song clone() throws CloneNotSupportedException {
        System.out.println("Cloning song");
        Song cloneSong = (Song) super.clone();
        return cloneSong;
    }
}
