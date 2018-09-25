package stubbing;

public class Person implements Soundable{

    private Animal pet;

    public Person(Animal pet) {
        this.pet = pet;
    }
    
    @Override
    public String sing() {
        return "lalala";
    }

    @Override
    public String talk() {
        return "blabla";
    }
    
    public int letPetWalk(int distance){
        return this.pet.walk(distance);
    }
    
    public String letPetTalk(){
        return this.pet.talk();
    }
    
}
