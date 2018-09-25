/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stubbing;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class PersonTest {

    private Person person;

    @Before
    public void init() {
        person = new Person(new Animal() {
            @Override
            public String sing() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String talk() {
                return "Woef woef";
            }

            @Override
            public int walk(int distance) {
                //Do whatever you want, just make sure it is the same
                return distance +555;
            }
            
           
            @Override
            public String animalBehaviour() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    @Test
    public void letPetTalkTestReturnsWoefWoef() {
        assertEquals("Woef woef", person.letPetTalk());
        
    }
    
    @Test
    public void letPetWalkTestReturnsWoefWoef() {
        assertEquals(560, person.letPetWalk(5)); 
    }

}
