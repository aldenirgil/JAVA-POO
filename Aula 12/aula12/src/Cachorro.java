public class Cachorro extends Lobo{

    public Cachorro(float peso, int idade, int membros, String corDoPelo) {
        super(peso, idade, membros, corDoPelo);
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "\npeso=" + peso +
                ",\nidade=" + idade +
                ",\nmembros=" + membros +
                ",\ncor do pelo=" + this.getCorDoPelo() +
                '}';
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au au");
    }


    public void reagir(String frase) {
        if( frase.toLowerCase().equals("toma comida") || frase.toLowerCase().equals("olá") ){
            System.out.println("Abanar o rabo e latir");
        }else{
            System.out.println("Rosnar");
        }
    }

    public void reagir( int hora, int minuto) {
        if (hora < 12){
            System.out.println("Abanar o rabo");
        }else if(hora > 18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar o rabo e latir");
        }
    }

    public void reagir(Boolean reacao){
        if(reacao){
            System.out.println("Abanar o rabo");
        }else{
            System.out.println("Rosnar e Latir");
        }
    }

    public void reagir(int idade, float peso){
        if ( idade <5 ){
            if ( peso < 10 ){
                System.out.println("Abanar o rabo");
            }else{
                System.out.println("Latir");
            }
        }else{
            if ( peso < 10 ){
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignorar");
            }
        }


    }

    public void enterrarOssos(){
        System.out.println("Enterrando ossos.");
    }

    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }
}
