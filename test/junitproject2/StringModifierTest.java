package junitproject2;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class StringModifierTest {

    private StringModifier stringModifier;

    @Before
    public void init() {
        stringModifier = new StringModifier();
    }

    @Test
    public void toUpperCaseTestSuccess() {

        String initialString = stringModifier.getMyString();

        stringModifier.toUpperCase();
        String stringToTest = stringModifier.getMyString();

        assertEquals("steven", initialString);
        assertEquals("STEVEN", stringToTest);
    }

    //GOED : 
    //startswith ....
    //contains '@'
    //ends with ....
    @Test
    public void eMailGeneratorTestSuccess() throws NameNullOrEmptyException {
        String eMail = stringModifier.eMailAddressGenerator("decock", "steven");
        assertTrue(eMail.startsWith("decock.steven"));
        assertTrue(eMail.contains("@"));
        assertTrue(eMail.endsWith("realdolmen.com"));
        //Eigenlijk is dit ook gewoon ok
        assertEquals("decock.steven@realdolmen.com", eMail);
    }

    @Test(expected = NameNullOrEmptyException.class)
    public void eMailGeneratorTestNameNull() throws NameNullOrEmptyException {
        stringModifier.eMailAddressGenerator(null, "steven");
    }

    @Test(expected = NameNullOrEmptyException.class)
    public void eMailGeneratorTestNameEmpty() throws NameNullOrEmptyException {
        String eMail = stringModifier.eMailAddressGenerator("", "steven");
    }

    @Test
    public void eMailGeneratorTestFirstNameNull() throws NameNullOrEmptyException {
        String eMail = stringModifier.eMailAddressGenerator("decock", null);
        assertEquals(eMail, "decock.willy@realdolmen.com");
    }

    @Test
    public void eMailGeneratorTestFirstNameEmpty() throws NameNullOrEmptyException {
        String eMail = stringModifier.eMailAddressGenerator("decock", "");
        assertEquals(eMail, "decock.willy@realdolmen.com");
    }
}
