public class Visitante extends Pessoa{
    public Visitante(String nome, String sexo, int idade) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);
    }

    @Override
    public String toString() {
        return "Visitante = " + this.getNome() +
                ", idade = " + this.getIdade() +
                ", sexo = " + this.getSexo();
    }

}
