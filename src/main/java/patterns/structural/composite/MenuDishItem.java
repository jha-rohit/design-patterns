package main.java.patterns.structural.composite;

/**
 * Created by rohit.jh on 11/06/19
 */
public class MenuDishItem extends MenuComponent {

    private String name;
    private int price;

    MenuDishItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void print() {
        System.out.println("Name : " + getName() + " Price: " + getPrice());
    }
}
