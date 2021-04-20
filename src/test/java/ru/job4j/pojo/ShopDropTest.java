package ru.job4j.pojo;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopDropTest {
    @Test
    public void whenDropFirst() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.delete(products, 0);
        assertEquals(rsl[0].getName(), "Bread");
        assertNull(rsl[1]);
    }

    @Test
    public void whenDropLast() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.delete(products, 1);
        assertEquals(rsl[0].getName(), "Milk");
        assertNull(rsl[1]);
    }

    @Test
    public void whenArrayLengthIs4AndDeleteElementWithIndex1() {
        Product[] products = new Product[4];
        products[0] = new Product("Bread", 4);
        products[1] = new Product("Egg", 10);
        products[2] = new Product("Milk", 2);
        products[3] = new Product("Fish", 3);
        int index = 1;
        Product[] rsl = ShopDrop.delete(products, index);
        assertEquals(rsl[index].getName(), "Milk");
        assertEquals(rsl[2].getName(), "Fish");
        assertNull(rsl[products.length - 1]);
    }

    @Test
    public void whenArrayLengthIs5AndDeleteElementWithIndex2() {
        Product[] products = new Product[5];
        products[0] = new Product("Bread", 4);
        products[1] = new Product("Egg", 10);
        products[2] = new Product("Milk", 2);
        products[3] = new Product("Fish", 3);
        products[4] = new Product("Fruit", 8);
        int index = 2;
        Product[] rsl = ShopDrop.delete(products, index);
        assertEquals(rsl[1].getName(), "Egg");
        assertEquals(rsl[index].getName(), "Fish");
        assertEquals(rsl[3].getName(), "Fruit");
        assertNull(rsl[products.length - 1]);
    }
}