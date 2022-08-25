import java.sql.SQLOutput;
import java.util.Random;

public class Luta {
    /*
    atributos do método
     */
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    /*
    Métodos Especiais
     */

    public void marcarLuta(Lutador l1, Lutador l2){
        if( l1 != l2 && l1.getCategoria().equals(l2.getCategoria())){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }


    public void Lutar(){
        if ( this.isAprovada() ){
            System.out.println("### Desafiado ###");
            this.getDesafiado().apresentar();
            System.out.println("### Desafiante ###");
            this.getDesafiante().apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 /1 /2
            System.out.println("=============== RESULTADO DA LUTA ================");
            switch (vencedor){
                case 0:
                    System.out.println("A luta empatou!");
                    desafiado.empatarLutas();
                    desafiante.empatarLutas();
                    break;
                case 1:
                    System.out.println("O desafiado " + desafiado.getNome() + " ganhou a luta!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(" O desafiante " + desafiante.getNome() + " ganhou a luta!");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
            System.out.println("===================================================");

        }else{
            System.out.println("A luta não pode ser realizada!");
        }
    }

    /*
    Métodos Modificadores e Auxiliares
     */
    /*
    public Luta(Lutador desafiado, Lutador desafiante, int rounds, boolean aprovada) {
        this.setDesafiado( desafiado );
        this.setDesafiante( desafiante );
        this.setRounds( rounds );
        this.setAprovada ( aprovada ) ;
    }

     */

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
