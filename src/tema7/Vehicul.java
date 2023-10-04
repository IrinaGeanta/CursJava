package tema7;

public class Vehicul {
    private String brand;
    private int nivelPoluare;
    private int vitezaMedie;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNivelPoluare() {
        return nivelPoluare;
    }

    public void setNivelPoluare(int nivelPoluare) {
        this.nivelPoluare = nivelPoluare;
    }

    public int getVitezaMedie() {
        return vitezaMedie;
    }

    public void setVitezaMedie(int vitezaMedie) {
        this.vitezaMedie = vitezaMedie;
    }

    public String nume(){
        return "Vehicul";
    }

    public String motorizare(){
        return "Motorizare";
    }

    public void detalii(){
        System.out.println("Nivelul de poluare pentru masina " + brand +  " este :" + nivelPoluare +
                " viteza medie atinsa este de " + vitezaMedie +" km/h");
    }
}
