public class Mamifero extends Animal{
    private String corDoPelo;

    public Mamifero(float peso, int idade, int membros, String corDoPelo) {
        super(peso, idade, membros);
        this.setCorDoPelo(corDoPelo);
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "\npeso=" + peso +
                ", \nidade=" + idade +
                ", \nmembros=" + membros +
                ", \ncor do pelo=" + corDoPelo +
                '}';
    }

    @Override
    public void locomover() {
        System.out.println("Mamífero se locomove correndo.");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamífero se alimenta mamando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Mamífero faz som de mamífero.");
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }
}
