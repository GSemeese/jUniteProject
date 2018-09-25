/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitproject2;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author SDOAX36
 */
public class ShoppingCartTest {
   
    private ShoppingCart shoppingCart;
    
    @Before
    public void init(){
        shoppingCart = new ShoppingCart();
    }
    
    @Test
    public void addTestProductNullReturnsFalse(){
        int initSize = shoppingCart.getProducts().size();
        assertFalse(shoppingCart.addProduct(null));
        int resultSize = shoppingCart.getProducts().size();
        assertEquals(initSize, resultSize);
    }
    
    @Test
    public void addTestProductAddedToListReturnsTrue(){
        int initSize = shoppingCart.getProducts().size();
        System.out.println(initSize);
        assertTrue(shoppingCart.addProduct(new Product(12.2, "Cola")));
        int resultSize = shoppingCart.getProducts().size();
        System.out.println(resultSize);
        assertEquals(initSize+1, resultSize);
    }
    
    
    @Test
    public void calculateTotalTest(){
        shoppingCart.addProduct(new Product(2, "cola"));
        shoppingCart.addProduct(new Product(3, "bier"));
        assertThat(5.00, CoreMatchers.equalTo(shoppingCart.calculateTotal()));
    }
    
    @Test
    public void calculateTotalTestEmptyCart(){
        assertThat(0.00, CoreMatchers.equalTo(shoppingCart.calculateTotal()));
    }
    
        //totaal prijs berekenen van de shoppingcart
        //tips : loop
        //return totaal
    
    
}
