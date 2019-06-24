package main.java.patterns.behavioural.command;

/**
 * Created by rohit.jh on 24/06/19
 */
public class SellOrder implements Order {

    private Stock stock;

    SellOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.sellStock();
    }
}
