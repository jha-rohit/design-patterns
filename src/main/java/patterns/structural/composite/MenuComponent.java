package main.java.patterns.structural.composite;

import java.util.List;

/**
 * Created by rohit.jh on 11/06/19
 */

public abstract class MenuComponent {
    public void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public List<MenuComponent> getChildren() {
        throw new UnsupportedOperationException();
    }

    public int getPrice() {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}
