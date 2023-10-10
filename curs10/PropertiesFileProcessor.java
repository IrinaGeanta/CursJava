package curs10;

import java.io.*;
import java.util.Properties;

public class PropertiesFileProcessor {

    /*
    Write properties file
     */

    public void writePropertiesFile(){

        try {
            OutputStream output = new FileOutputStream("test.properties");
            Properties propFile = new Properties();
            propFile.setProperty("hostname","amazon aws");
            propFile.setProperty("user","testUser");
            propFile.setProperty("browser","firefox");
            propFile.setProperty("email","testUser@email.com");
            propFile.store(output, "Am salvat fisierul!");
            output.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //read properties file

    public void readPropertiesFile(String key){
        try (InputStream input = new FileInputStream("test.properties")){
            Properties propFile = new Properties();
            propFile.load(input);
            System.out.println(propFile.getProperty(key));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //update properties file
    public void updatePropertiesFile(String key, String value){
        Properties propFile = new Properties();

        try (InputStream input = new FileInputStream("test.properties")){
            propFile.load(input);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (OutputStream output = new FileOutputStream("test.properties");
        ){

            propFile.setProperty(key,value);
            propFile.store(output, "Am salvat fisierul!");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
