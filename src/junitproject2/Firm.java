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
public class Firm extends Client{
    
    private String firmName;
    
    public Firm(int id, String firmName) {
        super(id);
        this.firmName = firmName;
    }
    
  
    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    @Override
    public String addDetails() {
        return firmName;
    }
    
    
    
    
}
