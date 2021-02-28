package jrr.by.lesson3.shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    private List<Product> productList;

    @BeforeEach
    void initialization() {
        productList = new ArrayList<>(Arrays.asList(
                new Product("Apple", new BigDecimal("14.15")),
                new Product("Book", new BigDecimal("20.20")),
                new Product("Cheese", new BigDecimal("250.00")),
                new Product("Diamond", new BigDecimal("1220.20"))));
    }

    @Test
    void addProduct() {
        Shop products = new Shop(productList);
        assertEquals(5,
                products.addProduct(new Product("Lego", new BigDecimal("13"))).size());
    }

    @Test
    void addNullProduct() {
        Shop products = new Shop(productList);
        assertEquals(4, products.addProduct(null).size());
    }

    @Test
    void deleteProduct() {
        Shop products = new Shop(productList);
        assertEquals(3, products.deleteProduct(productList.get(1)).size());
    }

    @Test
    void deleteNullProduct() {
        Shop products = new Shop(productList);
        assertEquals(4, products.deleteProduct(null).size());
    }

    @Test
    void deleteDefunctProduct() {
        Shop products = new Shop(productList);
        Product productForDeleting = new Product("Milk", new BigDecimal(10));
        assertEquals(4, products.deleteProduct(productForDeleting).size());
    }

    @Test
    void findProductByName() {
        Shop products = new Shop(productList);
        assertEquals(productList.get(0), products.findProductByName("apple"));
    }

    @Test
    void findProductByDefunctName() {
        Shop products = new Shop(productList);
        assertNull(products.findProductByName("popcorn"));
    }

    @Test
    void findProductByNullName() {
        Shop products = new Shop(productList);
        assertNull(products.findProductByName(""));
    }

    @Test
    void findProduct() {
        Shop products = new Shop(productList);
        assertEquals(2,
                products.findProduct(new BigDecimal("20.0"), new BigDecimal("300.0")).size());
    }

    @Test
    void findProductWrongMinAndMax() {
        Shop products = new Shop(productList);
        assertEquals(0,
                products.findProduct(new BigDecimal("300.0"), new BigDecimal("20.0")).size());
    }

    @Test
    void findNullProduct() {
        Shop products = new Shop(productList);
        assertEquals(0,
                products.findProduct(new BigDecimal("1.0"), new BigDecimal("2.0")).size());
    }
}