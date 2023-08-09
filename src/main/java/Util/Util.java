package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Util {
    private static final String CONFIG_PATH = "src/main/resources/init.properties";

    private static Properties readConfig(){
        try{
            Properties properties = new Properties();
            properties.load(new FileInputStream(CONFIG_PATH));
            return properties;
        } catch (IOException e) {
            System.out.println("Can't read config file");
            throw new RuntimeException(e);
        }
    }

    private static String readProperty(String value){
        Properties properties = readConfig();
        if (properties != null){
            return properties.getProperty(value);
        }else {
            System.out.println("This property do not exist");
            return null;
        }
    }

    public static String BASE_URL = readProperty("baseUrl");
    public static String GOOD_NAME = readProperty("good_name");
    public static String WRONG_NAME = readProperty("wrong_name");
    public static String GOOD_DATE = readProperty("good_date");
    public static String WRONG_DATE_FORMAT = readProperty("weong_date_format");
    public static String TOO_OLD_DATE = readProperty("too_old_date");
    public static String TOO_YOUNG_DATE = readProperty("too_young_date");
    public static String FUTURE_DATE = readProperty("future_date");
    public static String SUCCES_ALERT = readProperty("success_alert");
    public static String EMPTY_NAME_ALERT = readProperty("empty_name_alert");
    public static String WRONG_NAME_ALERT = readProperty("wrong_name_alert");
    public static String WRONG_DATE_ALERT = readProperty("wrong_date_alert");
    public static String TOO_YOUNG_ALERT = readProperty("too_youngh_alert");
    public static String TOO_OLD_ALERT = readProperty("too_old_alert");
    public static String FUTURE_ALERT = readProperty("future_alert");

}
