package aula04;
public class Caneta {
    
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;


    /*
     * método construtor tem o mesmo nome da classe
     */
    public Caneta( String m, float p, String c ) {
        this.setModelo(m);
        this.setPonta(p);
        this.setCor(c);
        this.tampar();

        this.status();
    }


    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String c){
        this.cor = c;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
    }

}
