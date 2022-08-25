public class Peixe extends Animal{

    private String corDaEscama;

    public Peixe(float peso, int idade, int membros, String corDaEscama) {
        super(peso, idade, membros);
        this.setCorDaEscama(corDaEscama);
    }

    @Override
    public void locomover() {
        System.out.println("Peixe se locomove nadando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Peixe se alimenta comendo algas.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixa não emite som.");
    }

    public void soltarBolhas(){
        System.out.println("Peixes soltam bolhas enquanto nadam.");
    }

    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }
}
