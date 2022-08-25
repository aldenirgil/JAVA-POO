public class Aula06 {
    public static void main(String[] args) throws Exception {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.play();
        c.aumentarVolume();
        c.abrirMenu();
    }
}
