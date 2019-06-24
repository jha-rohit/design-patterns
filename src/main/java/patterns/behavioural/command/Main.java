package main.java.patterns.behavioural.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rohit.jh on 24/06/19
 */
public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("Apple");
        List<Order> orderList = new ArrayList<>();
        orderList.add(new BuyOrder(stock));
        orderList.add(new SellOrder(stock));
        orderList.add(new SellOrder(stock));
        orderList.add(new BuyOrder(stock));
        orderList.add(new BuyOrder(stock));
        orderList.add(new SellOrder(stock));

        for (Order order : orderList) {
            order.execute();
            System.out.println("Current quantity : " + stock.getQuantity());
        }
    }
}
