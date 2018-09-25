/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitproject2;

/**
 *
 * @author SDOAX36
 */
public abstract class Person extends Client{
    
    private String name;
    
    public Person(int id,String name) {
        super(id);
        this.name = name;
    }
    
    public Person(){
        super(1);
        this.name = "Something";
    }
   

    @Override
    public abstract String addDetails();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
