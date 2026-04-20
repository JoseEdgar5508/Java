package Lampada;

public class lampada {
    public String marca;
    public String cor;
    private int potencia;
    protected int voltagem;
    private boolean ligada;

    public void status(){
        System.out.println("A marca da lampada: " + this.marca);
        System.out.println("Acor da lampada é: " + this.cor);
        System.out.println("A potência da lampada é: " + this.potencia);
        System.out.println("A voltagem da lampada é: " + this.voltagem);
        System.out.println("A lampada está ligada? " + this.ligada);
    }

    public void iluminar(){
        if(ligada == false){
            System.out.println("ERRO! A lâmpada está desligada.");
        }else{
            System.out.println("A lâmpada está iluminando.");
        }
    }
    
    public void ligar(){
        this.ligada = true;
    } 

    public void desligar(){
        this.ligada = false;
    }
}
