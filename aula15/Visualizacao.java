public class Visualizacao{

    private Gafanhoto expectador;
    private  Video filme;

    public Visualizacao(Gafanhoto expectador, Video filme) {
        this.expectador = expectador;
        this.filme = filme;
        this.expectador.setTotAssistido(this.expectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porc){
        int tot = 0;

        if ( porc <= 20 ) {
            this.filme.setAvaliacao(3);
        } else if ( porc <= 50 ) {
           this.filme.setAvaliacao(5);
        } else if ( porc <= 90 ) {
           this.filme.setAvaliacao(8);
        } else {
           this.filme.setAvaliacao(10);
        }
    }

    public Gafanhoto getExpectador() {
        return expectador;
    }

    public void setExpectador(Gafanhoto expectador) {
        this.expectador = expectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "expectador=" + expectador +
                ", filme=" + filme +
                '}';
    }
}
