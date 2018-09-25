
package junitproject2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }
    
    public boolean addProduct(Product product){
        if(product==null){
            return false;
        }
        products.add(product);
        return true;
    }
    
    public boolean removeProduct(Product product){
        //ALS product null is 
        //niets verwijderen = return false
        //ANDERS verwijderen = return true
        //Kan zijn, dat je eerst moet checken of het product aanwezig is
        return false;
    }
    
    public double calculateTotal(){
        //uit de lijst van producten willen we een som van alle prijzen 
        //die in de lijst zitten terug geven
        double total = 0.00;
        for(Product p : products){
           total += p.getPrice();
        }
        return total;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
    
    
    
    
}
