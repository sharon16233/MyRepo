package Lesson04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SystemVariables {

    private static String myDataPath = "\\resources\\myData.properties";

    public static void main(String[] args) throws IOException {
        String appConfigPath = System.getProperty("user.dir") + myDataPath;
        Properties prop = new Properties();
        prop.load(new FileInputStream(appConfigPath));

        System.out.println(prop.getProperty("browser"));
    }

}
