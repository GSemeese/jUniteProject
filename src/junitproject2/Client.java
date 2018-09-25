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
public abstract class Client {
    
    private int id;

    public Client(int id) {
        this.id = id;
    }
   
    public String createClientCard(){
        return "Klant "+id+" \n"+addDetails();
    }
    
    public abstract String addDetails();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
