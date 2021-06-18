package FirstLevel;

public class OddNumbers {

    private static final int start = 42;
    private static final int end = 96;

    public static void main(String[] args) {

        /*Print all odd numbers between 42 and 96*/
        for(int i = start + 1; i < end; i++) {
            if(i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
