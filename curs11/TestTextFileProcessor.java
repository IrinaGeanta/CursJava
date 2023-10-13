package curs11;

public class TestTextFileProcessor {
    public static void main(String[] args) {
        TextFileProcessor obj = new TextFileProcessor();
        obj.writeFile("Ana are mere!\n");
        obj.readFile();
        obj.updateTxtFile("Oana are pere!\n");
        obj.readFile();
    }
}
