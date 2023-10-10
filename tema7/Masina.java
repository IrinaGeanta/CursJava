package tema7;

public class Masina extends Vehicul{
    public Masina(String brand, int nivelPoluare, int vitezaMedie){
        super.setBrand(brand);
        super.setNivelPoluare(nivelPoluare);
        super.setVitezaMedie(vitezaMedie);
    }

    @Override
    public String nume(){
        return "Masina";
    }
    @Override
    public String motorizare(){
        return "Motor";
    }
    @Override
    public void detalii(){
        System.out.println("Nivelul de poluare pentru masina " + getBrand() +  " este :" + getNivelPoluare() +
                " viteza medie atinsa este de " + getVitezaMedie() +" km/h");
    }
}
