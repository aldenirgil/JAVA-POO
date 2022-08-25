public class TestaHeranca {

    public static void main(String[] args) {
        var v1 = new Visitante("Priscila", "feminino", 30);
        var a1 = new Aluno("Paulo", "masculino", 17, 22222, "Informática");
        var b1 = new Bolsista("Joana", "feminino", 16, 3333, "Pedagogia", 0.50F);

        System.out.println("\n====================================\n");
        System.out.println(v1.toString());
        v1.fazerAniversario();
        System.out.println(v1.getNome() + " completou " + v1.getIdade() + " anos. Parabéns!");

        System.out.println("\n====================================\n");
        System.out.println(a1.toString());
        a1.fazerAniversario();
        System.out.println(a1.getNome() + " completou " + a1.getIdade() + " anos. Parabéns!\n");
        a1.pagarMensalidade();

        System.out.println("\n====================================\n");
        System.out.println(b1.toString());
        b1.fazerAniversario();
        System.out.println(b1.getNome() + " completou " + b1.getIdade() + " anos. Parabéns!\n");
        b1.pagarMensalidade();
        System.out.println("\n====================================\n");

    }

}
