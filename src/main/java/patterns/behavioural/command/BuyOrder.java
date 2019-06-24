package main.java.patterns.behavioural.command;

/**
 * Created by rohit.jh on 24/06/19
 */
public class BuyOrder implements Order {

    private Stock stock;

    BuyOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.buyStock();
    }
}
