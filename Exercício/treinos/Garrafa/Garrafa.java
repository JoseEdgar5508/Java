package Garrafa;

public class Garrafa {
    public String marca;
    public String cor;
    float capacidade;
    protected int quantidade;
    private boolean tampada;

    public void status(){
        System.out.println("A marca é: " + this.marca);
        System.out.println("A cor é: " + this.cor);
        System.out.println("A capacidade é: " + this.capacidade);
        System.out.println("A quantidade é: " + this.quantidade);
        System.out.println("Está tampada: " + this.tampada);
    }

    public void beber(){
        if(this.tampada == true){
            System.out.println("ERRO! Não posso beber com a tampa fechada.");
        } else{
            System.out.println("Estou bebendo.");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}
