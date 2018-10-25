package qbeer.github.io;

import qbeer.github.io.stock.DefaultStock;

public class Main {

    public static void main(String[] args) {

        DefaultStock stock = new DefaultStock();
        stock.addProduct("banana", 1000, 0.88f);
        stock.addProduct("banana", 1000, 0.88f);
        stock.addProduct("apply", 1881, 0.65f);
        stock.getProduct("banana");
        stock.getProduct("tuna");

    }
}
