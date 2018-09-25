package junitproject2;

//imports

//static imports

//class
public class Product {
    //attributen (private of proteced)
    private double price;
    private String name;

    //constructors
    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    //methoden 
    public void doSomething(){
        
    }
    
    //setters en getters
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //toString
    
}
