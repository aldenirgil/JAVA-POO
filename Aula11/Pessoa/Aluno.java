public class Aluno  extends Pessoa{

    private int matricula;

    private String curso;

    public Aluno(String nome, String sexo, int idade, int matricula, String curso) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno = " + this.getNome() +
                ", idade = " + this.getIdade() +
                " anos, sexo = " + this.getSexo() +
                ", curso = " + this.getCurso() +
                ", matrícula = " + this.getMatricula();
    }

    public void pagarMensalidade (){
        System.out.println("Mensalidade paga!");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
