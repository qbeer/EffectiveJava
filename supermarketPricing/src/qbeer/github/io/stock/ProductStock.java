package qbeer.github.io.stock;

public interface ProductStock {
    public Product getProduct(String name) throws IllegalArgumentException;

    public void addProduct(String name, int quantity, float price);

}
