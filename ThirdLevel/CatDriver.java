package ThirdLevel;

public class CatDriver {

    public static void main(String[] args) {
        Cat c1 = new Cat("Ness", "Gray", 1, "1234");
        Cat c2 = new Cat("Tiger", "Orange", 4, "4567");

        c1.printCatInfo();
        System.out.println();
        c2.printCatInfo();
    }

}
