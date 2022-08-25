public class ContaBanco {
    
    public int Conta;
    protected String tipo;
    private String dono;
    private Float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("---------------------- ");
        System.out.println("Conta: " + this.getConta());
        System.out.println("Dono da Conta: " + this.getDono());
        System.out.println("Conta Tipo: " + this.getTipo());
        System.out.println("Saldo da Conta: " + this.getSaldo());
        System.out.println("Status da Conta: " + this.getStatus());
    }

    public void abrirConta( String t ){
        this.setTipo(t);
        this.setStatus(true);

        if (this.tipo.equals("CC") ){
            this.setSaldo(50.00F);
        }else {
            this.setSaldo(150.00F);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        if ( this.getSaldo() > 0 ) {
            System.out.println("Conta não pode ser fechada pois possui dinheiro");
        }else if( this.getSaldo() < 0 ){
            System.out.println( "Conta não pode ser fechada pois está em débito" );
        }else{
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso!");
        }
    }

    public void depositar( Float v ){
        if ( this.getStatus()){
            this.setSaldo(this.getSaldo() + v );
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }

    public void sacar( float v ){
        if ( this.getStatus() ){ 
            if ( this.getSaldo() >= v ){
                this.setSaldo( this.getSaldo() - v );
                System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
            }else{
                System.out.println("Conta não possui saldo suficiente para saque");
            }
        }else{
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }

    public void pagarMensal(){
        int v;
        if ( this.getTipo().equals("CC")){
            v = 12;
        }else{
            v = 20;
        }

        if( this.getStatus()){
            if (this.getSaldo() >= v ){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Mensalidade de R$ " + v + "paga com sucesso pela conta de " + this.getDono());
            }else{
                System.out.println("Não há saldo suficiente na conta de " + this.getDono());
            }
        }else{
            System.out.println("impossível debitar de uma conta fechada");
        }


    }


    public ContaBanco() {
        this.setStatus(false);
        this.setSaldo(0.0F);
    }



    public int getConta() {
        return this.Conta;
    }

    public void setConta(int Conta) {
        this.Conta = Conta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return this.status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



}
