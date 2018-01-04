package com.topwisesz.topwiseos.config;

import java.io.*;
import java.util.Properties;

public class BaseConfig {
    private static Properties prop;

    static {
        prop = new Properties();
        InputStream inStream;
        try {
            inStream = BaseConfig.class.getResourceAsStream("/com/topwisesz/topwiseos/config/baseconfig.properteis");
            BufferedReader bf = new BufferedReader(new InputStreamReader(inStream));
            prop.load(bf);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
