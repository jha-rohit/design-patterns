package main.java.patterns.creational.prototype;

/**
 * Created by rohit.jh on 19/06/19
 */
public class Album implements Cloneable {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Album clone() throws CloneNotSupportedException {
        System.out.println("Cloning album");
        Album cloneAlbum = (Album) super.clone();
        return cloneAlbum;
    }
}
