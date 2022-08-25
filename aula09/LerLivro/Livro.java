public class Livro implements Publicacao {

    private String livro;
    private String autor;
    private int totalPaginas;
    private boolean aberto;
    private Pessoa leitor;
    private int pagAtual;

    public Livro(String livro, String autor, int totalPaginas, Pessoa leitor) {
        this.setLivro(livro);
        this.setAutor(autor);
        this.setTotalPaginas(totalPaginas);
        this.setLeitor(leitor);
        this.setAberto(false);
        this.setPagAtual(0);
    }

    public String detalhes() {
        return "Livro{" +
                "livro='" + livro + '\'' +
                ", \n autor='" + autor + '\'' +
                ", \n totalPaginas=" + totalPaginas +
                ", \n aberto=" + aberto +
                ", \n leitor=" + leitor.getNome() +
                ", \n idade=" + leitor.getIdade() +
                ", \n sexo=" + leitor.getSexo() +
                ", \n pagAtual=" + pagAtual +
                '}';
    }

    /*
    public void detalhes(){

        System.out.println();
        System.out.println("================================");
        System.out.println();
        System.out.println(this.getLeitor().getNome() + " está lendo o livro \"" + this.getLivro() +"\"" );
        System.out.println("Nosso leitor é do sexo " + this.getLeitor().getSexo() + " e possui " + this.getLeitor().getIdade() + " anos.");
        System.out.println("Escrito por " + this.getAutor());
        System.out.println("Que possui " + this.getTotalPaginas() + " páginas");
        System.out.println("Ele está na página " + this.getPagAtual() );
        if (this.isAberto()) {
            System.out.println("O livro está aberto e está sendo lido no momento.");
        }else{
            System.out.println("O livro está fechado sobre a mesa.");
        }

    }


     */

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear( int p ) {
        this.setPagAtual(p);
    }

    @Override
    public void avancarPagina() {
        this.setPagAtual(this.getPagAtual()+1);
    }

    @Override
    public void voltarPagina() {
        this.setPagAtual(this.getPagAtual()-1);
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    private void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
}
