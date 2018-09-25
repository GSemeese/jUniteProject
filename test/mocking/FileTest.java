package mocking;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import org.mockito.Mock;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class FileTest {
    
    //Object to test
    private File file;
    //Object dat nodig is, maar niet getest wordt
    @Mock
    private Printer printer;
    
    @Before
    public void init(){
        file = new File("C://documents/","smldfjlmsdjkfmljqdfmjf");
    }

    @Test
    public void printTestThrowsException() throws Exception {
        //init mock data
        when(printer.startPrinting()).thenThrow(Exception.class);
        when(printer.size()).thenReturn(1);

        //do the test
        boolean result = file.print(printer);
        //verify your result
        assertFalse(result);
        verify(printer,times(0)).startPrinting();
        verify(printer,times(1)).size();
    }
    
    @Test
    public void printTestSizeZero() throws Exception{
        when(printer.size()).thenReturn(0);
        
        boolean result = file.print(printer);
        
        assertFalse(result);
        verify(printer,times(0)).startPrinting();
        verify(printer,times(1)).size();
    }
    
    @Test
    public void printTestSucces()throws Exception {
        //data initialiseren
        when(printer.size()).thenReturn(1);
        when(printer.startPrinting()).thenReturn(true);
        
        //test uitvoeren
        boolean result = file.print(printer);
        
        //verifieren dat alles correct is
        assertTrue(result);
        verify(printer,times(1)).size();
        verify(printer,times(1)).startPrinting();
    } 
}
