
package stubbing;

public abstract class Animal implements Soundable,Walkable {

    private int number;
    
    @Override
    public abstract String sing();

    @Override
    public abstract String talk();

    @Override
    public abstract int walk(int distance);
    
    public abstract String animalBehaviour();
    
}
