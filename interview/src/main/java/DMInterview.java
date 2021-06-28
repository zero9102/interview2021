package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 *  值传递， 还是引用传递
 */
public class DMInterview {

    public static void main(String[] args) {
        int myDigit = 10;
        modifyDigit(myDigit);
        System.out.println(myDigit);
        String dm = "Hello";
        System.out.println(dm.hashCode());
        modify(dm);
        System.out.println(dm);
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        System.out.println("myList-hashCode" + myList.hashCode());
        modifyList(myList);
        System.out.println(myList);
        int b = 10;
        int d = 10 + (10>>1);
        System.out.println(d);
    }

    private static int modifyDigit(int myDigit) {
        myDigit = myDigit + 10;
        return myDigit;
    }

    private static List<String> modifyList(List<String> myList) {
        System.out.println("modifyList-hashCode:" + myList.hashCode());
        myList.add("world");
        return myList;
    }

    private static String modify(String dm) {
        System.out.println("modifyString-hashCode:" + dm.hashCode());
//        dm = "World";
//        dm.concat("body");
        return dm;
    }

}
