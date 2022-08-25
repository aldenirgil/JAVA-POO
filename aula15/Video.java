public class Video implements AcoesVideo{

    private String titulo;
    private int avaliacao, views, curtidas;
    private boolean reproduzindo;


    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int)((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        if (!this.isReproduzindo()){
            this.setReproduzindo(true);
            System.out.println("Vídeo sendo reproduzido!");
        }else{
            System.out.println("Vídeo já estava sendo reproduzido!");
        }
    }

    @Override
    public void pause() {
        if (!this.isReproduzindo()){
           System.out.println("Vídeo já estava pausado");
        }else{
           System.out.println("Pausando o vídeo");
           this.setReproduzindo(false);
        }
    }

    @Override
    public void like() {
        System.out.println("Oba!!! Uma nova curtida.");
        this.setCurtidas(this.curtidas++);
        System.out.println("Total de curtidas " + this.getCurtidas());
    }

    @Override
    public String toString() {
        return "Video{" +
                "\ntitulo='" + titulo + '\'' +
                ",\n avaliacao=" + avaliacao +
                ",\n views=" + views +
                ",\n curtidas=" + curtidas +
                ",\n reproduzindo=" + reproduzindo +
                '}';
    }
}
