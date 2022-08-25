public class Gafanhoto extends Pessoa {

    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, String sexo, int idade, int experiencia, String login) {
        super(nome, sexo, idade);
        this.setLogin(login);
        this.setTotAssistido(0);
    }

    @Override
    public void ganharExp() {
        System.out.println("Aumentando o nível de experiência!");
        this.setExperiencia(this.getExperiencia()+1);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "\n nome='" + nome + '\'' +
                ",\n login='" + login + '\'' +
                ",\n sexo='" + sexo + '\'' +
                ",\n idade=" + idade +
                ",\n Total de filmes assistidos=" + totAssistido +
                ",\n experiencia do usuário =" + experiencia +
                '}';
    }
}
