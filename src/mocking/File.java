package mocking;

import java.util.logging.Level;
import java.util.logging.Logger;

public class File implements PrintJob{

    private String location;
    private String text;
    

    public File(String location, String text) {
        this.location = location;
        this.text = text;
    }
    
    @Override
    public boolean print(Printer printer) {
        if(printer.size()>0){
            try {
                return printer.startPrinting();
            } catch (Exception ex) {
                return false;
            }
        }
        return false;
    }
    
    
    
}
