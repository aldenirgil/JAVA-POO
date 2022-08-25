public class ControleRemoto implements Controlador {
    
    private int volume;
    private boolean ligado;
    private boolean tocando;  



    public ControleRemoto() {
        this.setLigado(true);
        this.setVolume(50);
    }

    /**
     * @return int return the volume
     */
    private int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    private void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return boolean return the ligado
     */
    private boolean getLigado() {
        return ligado;
    }

    /**
     * @param ligado the ligado to set
     */
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    /**
     * @return boolean return the tocando
     */
    private boolean getTocando() {
        return tocando;
    }

    /**
     * @param tocando the tocando to set
     */
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void abrirMenu() {
        // TODO Auto-generated method stub
        System.out.println("---------- MENU ------------");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume = " + this.getVolume() + " ");
        

        for (int i = 1; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
        
    }

    @Override
    public void ativarMudo() {
        // TODO Auto-generated method stub
        if ( this.getLigado() && this.getVolume() > 0 ){
            this.setVolume(0);
        }
    }

    @Override
    public void aumentarVolume() {
        // TODO Auto-generated method stub
        if (this.getLigado()){
            this.setVolume(this.getVolume()+5);
            System.out.println("Volume atual: " + this.getVolume());
        }
    }

    @Override
    //@Override igual a sobreescrever
    public void desativarMudo() {
        // TODO Auto-generated method stub
        if ( this.getLigado() && this.getVolume() == 0 ){
            this.setVolume(50);
        }
        
    }

    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        this.setLigado(false);
        
    }

    @Override
    public void diminuirVolume() {
        // TODO Auto-generated method stub
        if (this.getLigado() && this.getVolume()>0){
            this.setVolume(this.getVolume()-5);
            System.out.println("Volume atual: " + this.getVolume());
        }
    }

    @Override
    public void fecharMenu() {
        // TODO Auto-generated method stub
        System.out.println("Fechando menu... ");
        
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        this.setLigado(true);
        
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        if ( this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
        
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub

        if ( this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
        
    }

}