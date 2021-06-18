package FirstLevel;

public class Asterisk {

    public static void main(String[] args) {
        printAsterisk(10);
    }

    public static void printAsterisk(int num) {
        for(int i = 1; i <= num; i++) {
            for(int j = 0; j < i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

