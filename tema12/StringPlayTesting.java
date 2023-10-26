package tema12;

public class StringPlayTesting {
    public static void main(String[] args) {
        StringPlay sp = new StringPlay();
        System.out.println(sp.countNulla(sp.text));
        sp.splitSentences(sp.text);
        System.out.println("-----------------------");
        sp.deleteALetters(sp.text);
    }
}
