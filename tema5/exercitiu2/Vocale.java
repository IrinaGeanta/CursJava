package tema5.exercitiu2;
/*
u Scriem un program care numara cate vocale contine textul ” Eu invat Java”.
u Va printa urmatorul mesaj : Vocale: nr de vocale din text
 */
public class Vocale {
    public int numarVocale(String text){
        int count = 0;
        char litera;
        for (int i=0; i<text.length(); i++){
            litera = text.toUpperCase().charAt(i);
            switch (litera){
                case 'A', 'E', 'I', 'O', 'U':
                    count++;
                    break;
            }
        }
        return count;
    }
}
