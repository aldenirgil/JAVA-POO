public class Heranca {

    public static void main ( String[] args) {
        Pessoa p1 = new Pessoa("Pedro",25, "Masculino");
        Aluno p2 = new Aluno("Maria",17, "Feminino");
        Professor p3 = new Professor("Claudia",35, "Feminino");
        Funcionario p4 = new Funcionario("Fabiana",30, "Feminino");

        p2.setCurso("Informática");
        p3.setSalario(2500.75F);
        p4.setSetor("Estoque");

        p3.receberAumento(550.20F);
        p4.mudarTrabalho();
        p2.cancelarMatricula();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());


    }
}
