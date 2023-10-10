package tema7;

public class Bicicleta extends Vehicul{
    public Bicicleta(String brand, int nivelPoluare, int vitezaMedie){
        super.setBrand(brand);
        super.setNivelPoluare(nivelPoluare);
        super.setVitezaMedie(vitezaMedie);
    }

    @Override
    public String nume(){
        return "Bicicleta";
    }
    @Override
    public String motorizare(){
        return "Fara motor";
    }
    @Override
    public void detalii(){
        System.out.println("Nivelul de poluare pentru masina " + getBrand() +  " este :" + getNivelPoluare() +
                " viteza medie atinsa este de " + getVitezaMedie() +" km/h");
    }
}
