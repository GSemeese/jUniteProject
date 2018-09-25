
package junitproject2;

public class NameNullOrEmptyException extends Exception{

    private static final String MESSAGE = "U naam is niet correct!";
    
    @Override
    public String getMessage() {
        return MESSAGE;
    }
    
}
