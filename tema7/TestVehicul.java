package tema7;

public class TestVehicul {

    public static void main(String[] args) {

        Vehicul bicicleta = new Bicicleta("Pegas", 0,40);
        Vehicul masina = new Masina("Seat",2,120);

        verificaMotorizarea(bicicleta);
        verificaMotorizarea(masina);

        bicicleta.detalii();
        masina.detalii();

    }

    public static void verificaMotorizarea(Vehicul vehicul){
        System.out.println(vehicul.nume());
        vehicul.detalii();
    }
}
