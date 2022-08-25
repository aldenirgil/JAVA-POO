public class Bolsista extends Aluno{

    private float bolsa;

    public Bolsista(String nome, String sexo, int idade, int matricula, String curso, float bolsa) {
        super(nome, sexo, idade, matricula, curso);
        this.setBolsa(bolsa);
    }

    @Override
    public String toString() {

        return "Bolsista = " + this.getNome() +
                ", idade = " + this.getIdade() +
                " anos, sexo = " + this.getSexo() +
                ", curso = " + this.getCurso() +
                ", matrícula = " + this.getMatricula() +
                ", bolsa=" + ((int) this.getBolsa()) + "%";
    }

    public void renovarBolsa(){
        System.out.println("Valor da bolsa renovado!");
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga! Foi aplicado o desconto de " + ((int) this.getBolsa())
                            + "%, referente ao valor da sua bolsa");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa*100;
    }
}
