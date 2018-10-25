package qbeer.github.io.stock;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DefaultStock implements ProductStock {

    List<Product> products = new ArrayList<>();

    @Override
    public Optional<Product> getProduct(String name){
        Optional<Product> product = products.stream().filter(prd -> prd.getName().equals(name)).findFirst();
        if (product.isPresent()) {
            return product;
        }

    }

    @Override
    public void addProduct(String name, int quantity, float price) {
        return this.getProduct(name).isPresent() ? return : products.add(new Product(name, quantity, price));
    }
}
