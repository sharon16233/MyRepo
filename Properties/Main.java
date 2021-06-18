package Properties;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(Utils.getValue("name"));
        System.out.println(Utils.getValue("lastName"));
        System.out.println(Utils.getValue("Url"));
        System.out.println(Utils.getValue("browser"));
    }
}
