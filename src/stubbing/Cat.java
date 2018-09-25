
package stubbing;


public class Cat extends Animal{

    @Override
    public String sing() {
        return "miauw";
    }

    @Override
    public String talk() {
        return "miauw";
    }

    @Override
    public String animalBehaviour() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int walk(int distance) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
