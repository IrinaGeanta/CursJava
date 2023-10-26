package tema12;

import java.util.Arrays;

/*
Avem urmatorul string : “Lorem ipsum dolor sit amet, consectetur
adipiscing elit. Aliquam consectetur odio ac quam commodo, eu
eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus,
vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius
malesuada. Nulla neque lacus, euismod quis erat nec, convallis
vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat.
Nulla elementum urna in dolor viverra, in efficitur lectus mattis.”
u Vom face 4 metode :
u 1. Prima metoda va verifica de catre ori apare cuvantul “Nulla” in
acest string si va printa numarul
u 2. A doua metoda va imparti stringul in cate propozitii cuprinde si le
va printa fiecare pe randul ei in consola
u 3. A treia metoda va folosi metoda deleteCharAt() din StringBuilder
pentru a sterge toate aparitiile literei ‘a’
 */
public class StringPlay {
    String text = "Lorem ipsum dolor sit amet, consectetur" +
            "adipiscing elit. Aliquam consectetur odio ac quam commodo, eu" +
            "eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus," +
            "vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius" +
            "malesuada. Nulla neque lacus, euismod quis erat nec, convallis" +
            "vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat." +
            "Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";

    public int countNulla(String txt){

        // am facut minunea asta sa pot sa prind acel Nulla care era legat de punct si cuvantul de dinaintea lui..
        // asa ca am replaced toate non alpha numeric cu space ca sa pot sa iau cuvant separat :) banui ca exista niste rezolvari mai elegante :))
        String text = txt.replaceAll("[^a-zA-Z0-9]", " ");
        String [] words = text.split(" ");
        int count = 0;
        for (String word : words){
            if (word.trim().equals("Nulla")){
                count++;
            }
        }
        return count;
    }

    public void splitSentences(String txt){
        String [] sentences = txt.split("\\.");
        for (String sentence : sentences){
            System.out.println(sentence);
        }
    }

    public void deleteALetters(String txt){
        StringBuilder sb = new StringBuilder(txt);
        for (int i = 0; i < sb.length(); i++){
            if (sb.charAt(i) == 'a'){
                sb.deleteCharAt(i);
            }
        }
        System.out.println(sb);
    }


}



