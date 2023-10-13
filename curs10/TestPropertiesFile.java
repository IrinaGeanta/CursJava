package curs10;

//CRUD operations
//Create
//Read
//Update
//Delete
public class TestPropertiesFile {
    public static void main(String[] args) {
        PropertiesFileProcessor obj = new PropertiesFileProcessor();
        obj.writePropertiesFile();
        obj.readPropertiesFile("hostname");
        obj.updatePropertiesFile("hostname", "Google cloud");
        obj.readPropertiesFile("hostname");

        System.out.println("-----------------------------");
        obj.deleteFromPropertiesFile("hostname");
        obj.readPropertiesFile("hostname");
        obj.readPropertiesFile("email");
    }
}
