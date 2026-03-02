package aula06;

public class ControleRemoto implements Controlador{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Métodos especiais

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    private boolean getLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private boolean getTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        // TODO Auto-generated method stub
        System.out.println("-----MENU-----");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i += 10){
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        // TODO Auto-generated method stub
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        // TODO Auto-generated method stub
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        } else{
            System.out.println("Impossível aumetar volume.");
        }
    }
    @Override
    public void menosVolume(){
        // TODO Auto-generated method stub
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        } else{
            System.out.println("Impossível deminuir volume!");
        }
    }

    @Override
    public void ligarMudo() {
        // TODO Auto-generated method stub
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        // TODO Auto-generated method stub
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        } else{
            System.out.println("Não consegui reproduzir.");
        }
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else{
            System.out.println("Não consegui pausar.");
        }
    }

    
}
