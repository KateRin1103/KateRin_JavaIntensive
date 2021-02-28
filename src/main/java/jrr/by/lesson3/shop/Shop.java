package jrr.by.lesson3.shop;

import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Shop {

    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(products, shop.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "products=" + products +
                '}';
    }

    Logger logger = Logger.getLogger(Shop.class);

    public List<Product> addProduct(Product newProduct) {
        if (newProduct != null) {
            products.add(newProduct);
        }
        return products;
    }

    public List<Product> deleteProduct(Product deleteProduct) {
        if (deleteProduct != null) {
            products.remove(deleteProduct);
        } else logger.info("Can't delete product!");
        return products;
    }

    public Product findProductByName(String name) {

        Product found = null;

        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())
                    && !name.equals("")) {
                found = product;
                break;
            }
        }
        if (found == null) {
            logger.info("Products are not found!");
            return null;
        } else {
            logger.info(found.toString());
            return found;
        }
    }

    public List<Product> findProduct(BigDecimal minPriceRange, BigDecimal maxPriceRange) {

        List<Product> found = new ArrayList<>();

        for (Product product : products) {
            if (product.getPrice().compareTo(minPriceRange) > 0
                    && product.getPrice().compareTo(maxPriceRange) < 0) {
                found.add(product);
            }
        }
        if (!found.isEmpty()) {
            logger.info(found.toString());
        } else if (minPriceRange.compareTo(maxPriceRange) > 0) {
            logger.info("Change minPriceRange and maxPriceRange!");
        } else {
            logger.info("Products are not found!");
        }
        return found;
    }
}
