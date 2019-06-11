package main.java.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rohit.jh on 11/06/19
 */
public class Menu extends MenuComponent {

    private List<MenuComponent> components;
    private String menuName;

    Menu(String menuName) {
        this.components = new ArrayList<>();
        this.menuName = menuName;
    }

    public String getName() {
        return menuName;
    }

    public void add(MenuComponent menuComponent) {
        this.components.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        this.components.remove(menuComponent);
    }

    public List<MenuComponent> getChildren() {
        return components;
    }

    @Override
    public void print() {
        System.out.println("Inside " + menuName);
        for (MenuComponent component : components) {
            component.print();
        }
    }
}
