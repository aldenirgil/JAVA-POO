public class Ave extends Animal{

    private String corDaPena;

    public Ave(float peso, int idade, int membros, String corDaPena) {
        super(peso, idade, membros);
        this.corDaPena = corDaPena;
    }

    @Override
    public void locomover() {
        System.out.println("A ave se locomove voando.");
    }

    @Override
    public void alimentar() {
        System.out.println("A ave se alimenta de frutas.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de ave.");
    }

    public void fazerNinho(){
        System.out.println("A ave fez construiu um ninho!");
    }

    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }
}
