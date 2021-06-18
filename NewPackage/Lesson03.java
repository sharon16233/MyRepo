package NewPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Lesson03 {

    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();
        InputStream input = new FileInputStream("D:\\New folder\\file.txt");
        prop.load(input);
        System.out.println(prop.get("name"));
        prop.setProperty("name", "Alon");
        System.out.println(prop.get("name"));

    }

}
