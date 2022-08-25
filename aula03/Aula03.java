package aula03;

public class Aula03 {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.modelo =  "Bic Cristal";
        c1.cor = "Azul";
        c1.carga = 80;
        c1.tampada = true;
        c1.status();
    }
}
