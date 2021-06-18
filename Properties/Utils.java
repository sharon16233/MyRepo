package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utils {

    private static final String fileLocation = "D:\\New folder\\values.txt";
    private static Properties prop = new Properties();

    public static String getValue(String key) throws IOException {
        InputStream input = new FileInputStream(fileLocation);
        prop.load(input);

        return prop.get(key).toString();
    }
}
