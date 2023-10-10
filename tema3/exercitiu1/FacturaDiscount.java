package tema3.exercitiu1;

public class FacturaDiscount {
    public void applyDiscount(int factura){
        int facturaCuDiscount;
        facturaCuDiscount = (factura > 100)?(factura - factura*10/100) : (factura - factura*5/100);
        System.out.println("Factura are aplicat un discount de: " + ((factura > 100)?"10% ":"5% ") + "si insumeaza: " + facturaCuDiscount);
    }
}
