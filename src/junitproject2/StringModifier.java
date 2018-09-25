package junitproject2;

public class StringModifier {

    private String myString;

    public StringModifier() {
        myString = "steven";
    }
    
    public void toUpperCase(){
       this.myString = this.myString.toUpperCase();
        System.out.println(myString.toString());
    }
    
    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }
    
    public String eMailAddressGenerator(String name,String firstName) throws NameNullOrEmptyException{
        if(name == null || name.isEmpty()){
            throw new NameNullOrEmptyException();
        }
        if(firstName == null || firstName.isEmpty()){
            firstName = "willy";
        }
        return name+"."+firstName+"@realdolmen.com";
    }
}
