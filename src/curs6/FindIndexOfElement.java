package curs6;


import java.util.Arrays;

public class FindIndexOfElement {
    Integer[] numbers = {2,4,9,8,1,12,44,55};

    public void rezolvareCuFor (int nr){
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] == nr){
                System.out.println("Numarul: " + nr + " este pe pozitia: " + i);
                break;
            }
        }

    }

    public void rezolvareCuForEach (int nr){

        /*
        for (int element : numbers){
            if (element == nr){

                break;
            }
        }
        */
        //System.out.println("Numarul: " + nr + " este pe pozitia: " + Arrays.asList(numbers).indexOf(nr));

        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        FindIndexOfElement obj = new FindIndexOfElement();
                obj.rezolvareCuForEach(8);
    }

}
