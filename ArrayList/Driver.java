package ArrayList;

import java.util.ArrayList;


public class Driver {

    public static void main(String[] args) {

        // Default constructor.
        Colors c1 = new Colors();
        c1.sortAscending();
        System.out.println("Default arrayList:");
        c1.printArrayListForEach();
        System.out.println();

        // Constructor with parameters.
        ArrayList<String> colorsArrayList = new ArrayList<String>();
        colorsArrayList.add("Black");
        colorsArrayList.add("Yellow");
        colorsArrayList.add("Purple");

        Colors c2 = new Colors(colorsArrayList);
        c2.sortAscending();
        System.out.println("Another arrayList:");
        c2.printArrayListForEach();

    }
}
