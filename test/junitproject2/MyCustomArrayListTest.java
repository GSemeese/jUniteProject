package junitproject2;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class MyCustomArrayListTest {

    //object to test
    private MyCustomArrayList myCustomArrayList;
    //list object to check
    private List<String> listToCheck;

    @Before
    public void init() {
        myCustomArrayList = new MyCustomArrayList();
        listToCheck = new ArrayList();
    }

    @Test
    public void addStringTestLengthArrayOneUp() {
        int initLength = myCustomArrayList.getMyList().size();

        myCustomArrayList.addString("string ");

        int lengthToTest = myCustomArrayList.getMyList().size();
        assertEquals(initLength + 1, lengthToTest);
    }

    @Test
    public void addStringTestStringIsPresent() {
        String stringToAdd = "Hello";
        assertFalse(myCustomArrayList.getMyList().contains(stringToAdd));

        myCustomArrayList.addString(stringToAdd);

        assertTrue(myCustomArrayList.getMyList().contains(stringToAdd));
    }

    @Test
    public void addStringTestIndexCorrect() {
        String stringToAdd = "Hello";

        myCustomArrayList.addString(stringToAdd);
        int index = myCustomArrayList.getMyList().indexOf(stringToAdd);

        assertEquals(myCustomArrayList.getMyList().size(), index + 1);
    }

    @Test
    public void addStringTestEmptyNotAdded() {
        String stringToAdd = "";
        int initLength = myCustomArrayList.getMyList().size();
        myCustomArrayList.addString(stringToAdd);

        int lengthToTest = myCustomArrayList.getMyList().size();
        assertEquals(initLength, lengthToTest);
        assertFalse(myCustomArrayList.getMyList().contains(stringToAdd));
    }

    @Test
    public void addStringTestNullNotAdded() {
        int initLength = getInitLength();

        int lengthToTest = myCustomArrayList.getMyList().size();
        assertEquals(initLength, lengthToTest);
        assertFalse(myCustomArrayList.getMyList().contains(null));
    }

    private int getInitLength() {
        String stringToAdd = null;
        int initLength = myCustomArrayList.getMyList().size();
        myCustomArrayList.addString(stringToAdd);
        return initLength;
    }

    @Test
    public void removeUrlTestLengthChangedItemsRemoved() {
        listToCheck.add("Steven");
        listToCheck.add("www.ikgaweg.be");
        listToCheck.add("http://ikook.be");
        myCustomArrayList.setMyList(listToCheck);
        
        myCustomArrayList.removeAllUrls();

        assertEquals(1, myCustomArrayList.getMyList().size());
        assertTrue(myCustomArrayList.getMyList().contains("Steven"));
        assertFalse(myCustomArrayList.getMyList().contains("www.ikgaweg.be"));
    }

    @Test
    public void somethingWithASwitchTestOne(){
        assertEquals("one", myCustomArrayList.somethingWithASwitch(1));
    }
    
    @Test
    public void somethingWithASwitchTestTwo(){
        assertEquals("two", myCustomArrayList.somethingWithASwitch(2));
    }
    
    @Test
    public void somethingWithASwitchTestThree(){
        assertEquals("three", myCustomArrayList.somethingWithASwitch(3));
    }
    
    @Test
    public void somethingWithASwitchTestDefault(){
        assertNull(myCustomArrayList.somethingWithASwitch(25));
    }
}
