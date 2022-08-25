public class Lobo extends Mamifero{
    public Lobo(float peso, int idade, int membros, String corDoPelo) {
        super(peso, idade, membros, corDoPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println("Auuuuuuuuu");
    }
}
