public class Main {
    public static void main(String[] args) {

        var m = new Mamifero(5.75F, 8, 4, "preto");
        System.out.println(m.toString());
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println("\n######################################\n");
        var c = new Canguru(55.3F, 3, 4, "marrom");
        System.out.println(c.toString());
        c.locomover();
        c.alimentar();
        c.emitirSom();
        System.out.println("\n######################################\n");
        var k = new Cachorro(3.9F, 5, 4, "malhado");
        System.out.println(k.toString());
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.reagir("Olá"); // Abanar e Latir
        k.reagir("Vai apanhar"); // Rosnar
        k.reagir(11,45); // Abanar
        k.reagir(21,8); // Ignorar
        k.reagir(true); // Abanar
        k.reagir(false); // Rosnar e Latir
        k.reagir(2,12.5F); // Latir
        k.reagir(17,4.5F); // Rosnar

    }
}