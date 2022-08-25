public class Reptil extends Animal {

    private String corDaEscama;

    public Reptil(float peso, int idade, int membros, String corDaEscama) {
        super(peso, idade, membros);
        this.setCorDaEscama(corDaEscama);
    }

    @Override
    public void locomover() {
        System.out.println("Reptil se locomove rastejando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Réptil se alimenta de vegetais.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de réptil.");
    }



    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }
}
