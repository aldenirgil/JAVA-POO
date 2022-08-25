public class Canguru extends Mamifero{

    public Canguru(float peso, int idade, int membros, String corDoPelo) {
        super(peso, idade, membros, corDoPelo);
    }

    @Override
    public String toString() {
        return "Canguru{" +
                "\npeso=" + peso +
                ",\nidade=" + idade +
                ",\nmembros=" + membros +
                ",\ncor do pelo=" + this.getCorDoPelo() +
                '}';
    }

    public void usarBolsa(){
        System.out.println("Usando a bolsa para carregar seu filhote.");
    }

    @Override
    public void locomover() {
        System.out.println("Canguru se locomove pulando.");
    }
}
