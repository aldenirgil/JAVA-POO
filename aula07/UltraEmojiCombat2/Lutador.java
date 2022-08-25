import java.text.DecimalFormat;

public class Lutador {

    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private Float altura, peso;


    /**
     * @param nome
     * @param nacionalidade
     * @param idade
     * @param altura
     * @param peso
     * @param vitorias
     * @param derrotas
     * @param empates
     */
    public Lutador(
            String nome,
            String nacionalidade,
            int idade,
            float altura,
            float peso,
            int vitorias,
            int derrotas,
            int empates
    ) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);

    }


    public void apresentar(){

        DecimalFormat frmt = new DecimalFormat();
        frmt.setMaximumFractionDigits(2);

        System.out.println("##########################");
        System.out.println("Bem vindo ao UEC!");
        System.out.println("##########################");
        System.out.println("");
        System.out.println("No ring " + this.getNome());
        System.out.println("Nosso competidor é da " + this.getNacionalidade());
        System.out.println("Ele tem " + this.getIdade() + " anos.");
        System.out.println( "Medindo " + frmt.format(this.getAltura()) + " metros");
        System.out.println( "Pesando " + frmt.format(this.getPeso()) + " kilos.");
        System.out.println( "Categoria " + this.getCategoria() );
        System.out.println( "Ele possui " + this.getVitorias() + " vitórias!" );
        System.out.println( "Ele possui " + this.getDerrotas()  + " derrotas!");
        System.out.println( "Ele possui " + this.getEmpates()  + " empates!");


    }


    public void status(){

        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes.");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }

    public void empatarLutas(){
        this.setEmpates(this.getEmpates()+1);
    }


    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the nacionalidade
     */
    public String getNacionalidade() {
        return nacionalidade;
    }

    /**
     * @param nacionalidade the nacionalidade to set
     */
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    /**
     * @return int return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return double return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(Float altura) {
        this.altura = altura;
    }

    /**
     * @return double return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    /**
     * @return String return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    private void setCategoria() {
        if( this.getPeso() < 52.2){
            this.categoria = "invalida";
        }else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        }else if(this.getPeso() <= 83.9 ){
            this.categoria = "Médio";
        }else if (this.getPeso() <= 120.2 ) {
            this.categoria = "Pesado";
        }else {
            this.categoria = "invalido";
        }
    }

    /**
     * @return int return the vitorias
     */
    public int getVitorias() {
        return vitorias;
    }

    /**
     * @param vitorias the vitorias to set
     */
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    /**
     * @return int return the derrotas
     */
    public int getDerrotas() {
        return derrotas;
    }

    /**
     * @param derrotas the derrotas to set
     */
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    /**
     * @return int return the empates
     */
    public int getEmpates() {
        return empates;
    }

    /**
     * @param empates the empates to set
     */
    public void setEmpates(int empates) {
        this.empates = empates;
    }

}