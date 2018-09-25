
package stubbing;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class SoundBoardTest {
    
    //this is the object to test;
    private SoundBoard soundBoard;
    
    @Before
    public void init(){
        Soundable stub = new StubSoundable();
        soundBoard = new SoundBoard(stub);
    }
    
    @Test
    public void letTheNoiseMakerSingTestReturnsNoisableSing(){
        assertEquals("myStub sings a song 1", soundBoard.letTheNoiseMakerSing());
    }
    
    @Test 
    public void letTheNoiseMakerTalkTestReturnsNoisableTalk(){
        assertEquals("Animal, I am not your father 2", soundBoard.letTheNoiseMakerTalk());
    }
    
    
    //let's stub it
    class StubSoundable implements Soundable {
        
        @Override
        public String sing() {
            return "myStub sings a song 1";
        }

        @Override
        public String talk() {
            return "Animal, I am not your father 2";
        }
    }

}
