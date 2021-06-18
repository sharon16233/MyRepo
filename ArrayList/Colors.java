package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Colors {

    private ArrayList<String> colors = new ArrayList<String>();

    public Colors() {
        this.colors.add("Red");
        this.colors.add("Blue");
        this.colors.add("Green");
    }

    public Colors(ArrayList<String> otherColors) {
        for (int i = 0; i < otherColors.size(); i++) {
            this.colors.add(otherColors.get(i));
        }
    }

    public void printArrayListForEach() {
        for(String element : this.colors) {
            System.out.println(element);
        }
    }

    public void printArrayListFor() {
        for(int i = 0; i < this.colors.size(); i++) {
            System.out.println(this.colors.get(i));
        }
    }

    public void sortAscending() {
        Collections.sort(this.colors);
    }

    public void sortDescending() {
        Collections.sort(this.colors, Collections.reverseOrder());
    }

}
