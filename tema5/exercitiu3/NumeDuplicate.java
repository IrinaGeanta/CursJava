package tema5.exercitiu3;

public class NumeDuplicate {

    public void verificaNumeDuplicate(String[] numeDeVerificat){
        for (int i =0; i< numeDeVerificat.length-1; i++){
            for (int j = i+1; j<numeDeVerificat.length; j++){
                if (numeDeVerificat[i].equals(numeDeVerificat[j])){
                    System.out.println("Numele este duplicat: " + numeDeVerificat[i]);
                    break;
                }
            }
        }
    }
}
