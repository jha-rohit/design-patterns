package main.java.patterns.structural.composite;

/**
 * Created by rohit.jh on 11/06/19
 */
public class Main {

    public static void main(String[] args) {
        MenuComponent allMenus = new Menu("All Menu");

        MenuComponent breakFastMenu = new Menu("BreakFast Menu");
        breakFastMenu.add(new MenuDishItem("Pancake", 100));
        breakFastMenu.add(new MenuDishItem("Sandwich", 70));
        breakFastMenu.add(new MenuDishItem("Idli", 50));

        MenuComponent lunchMenu = new Menu("Lunch Menu");

        MenuComponent mainCourse = new Menu("Main Course Menu");
        mainCourse.add(new MenuDishItem("Chicken Masala", 150));
        mainCourse.add(new MenuDishItem("Chicken Biryani", 200));
        mainCourse.add(new MenuDishItem("Veg Pulao", 150));

        MenuComponent dessertMenu =  new Menu("Dessert Menu");
        dessertMenu.add(new MenuDishItem("Ice Cream", 20));
        dessertMenu.add(new MenuDishItem("Chocolate Brownie", 30));

        lunchMenu.add(mainCourse);
        lunchMenu.add(dessertMenu);

        allMenus.add(breakFastMenu);
        allMenus.add(lunchMenu);

        allMenus.print();

    }
}
