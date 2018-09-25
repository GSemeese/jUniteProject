package junitproject2;

import java.util.ArrayList;
import java.util.List;

public class MyCustomArrayList {

    private List<String> myList;

    public MyCustomArrayList() {
        myList = new ArrayList<>(); 
    }

    public boolean addString(String aString) {
        return (aString == null || aString.isEmpty()) ? false : myList.add(aString);
    }

    public void removeString(String aString) {
        //ALS NIET aString null en empty DAN verwijderen
        //
    }

    public int addStringAtIndex(String aString, int index) {
        return 0;
    }

    public int getIndexOf(String aString) {
        return 0;
    }

    public String get(int index) {
        return "";
    }

    public void removeAllUrls() {
        List<String> tempList = new ArrayList<>();
        if (!myList.isEmpty()) {
            for (String s : myList) {
                if (s.startsWith("http") || s.startsWith("www")) {
                    tempList.add(s);
                }
            }
            this.myList.removeAll(tempList);
        }
    }
    
    public String somethingWithASwitch(int i){
        switch(i){
            case 1 : return "one";
            case 2 : return "two";
            case 3 : return "three";
            default: return null;
        }
    }

    public List<String> getMyList() {
        return myList;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

}
