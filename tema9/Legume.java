package tema9;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Legume {

    public void writePropertiesFile(){

        try {
            OutputStream output = new FileOutputStream("legume.properties");
            Properties propFile = new Properties();
            propFile.setProperty("broccoli","33.7");
            propFile.setProperty("conopida","24.9");
            propFile.setProperty("pastarnac","75");
            propFile.setProperty("spanac","23.2");
            propFile.setProperty("varza","24.6");
            propFile.store(output, "Am salvat fisierul!");
            output.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void readPropertiesFile(String key){
        try (InputStream input = new FileInputStream("legume.properties")){
            Properties propFile = new Properties();
            propFile.load(input);
            System.out.println("Leguma aleasa de tine are "+ propFile.getProperty(key) + " calorii.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Set<Object> getAllKeys(){
        try (InputStream input = new FileInputStream("legume.properties")){
            Properties propFile = new Properties();
            propFile.load(input);
            Set<Object> keys = propFile.keySet();
            return keys;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
