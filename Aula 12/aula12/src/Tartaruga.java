public class Tartaruga extends Reptil{
    public Tartaruga(float peso, int idade, int membros, String corDaEscama) {
        super(peso, idade, membros, corDaEscama);
    }

    @Override
    public void locomover() {
        System.out.println("Tartaruga anda bem devagar.");
    }
}
