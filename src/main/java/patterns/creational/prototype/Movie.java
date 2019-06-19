package main.java.patterns.creational.prototype;

/**
 * Created by rohit.jh on 19/06/19
 */
public class Movie implements Cloneable {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Movie clone() throws CloneNotSupportedException {
        System.out.println("Cloning movie");
        Movie cloneMovie = (Movie) super.clone();
        return cloneMovie;
    }
}
