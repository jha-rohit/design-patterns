package main.java.patterns.behavioural.command;

/**
 * Created by rohit.jh on 24/06/19
 */
public class Stock {
    private String stockName;
    private int quantity = 0;

    Stock(String name) {
        this.stockName = name;
    }

    void buyStock() {
        System.out.println("Buying stock of :" + stockName);
        quantity++;
    }

    void sellStock() {
        System.out.println("Selling stock of : " + stockName);
        if (quantity > 0) {
            quantity--;
        } else System.out.println("Insufficient stocks");
    }

    int getQuantity() {
        return this.quantity;
    }
}
