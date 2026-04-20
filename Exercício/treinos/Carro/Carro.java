package Carro;

public class Carro {
    String modelo;
    String cor;
    int velocidade;
    boolean ligado;

    void status(){
        System.out.println("O modelo do carro é: " + modelo);
        System.out.println("A cor do carro é: " + cor);
        System.out.println("A velocidade do carro é: " + velocidade);
        System.out.println("Está ligado: " + ligado);
    }

    void ligar(){
        this.ligado = true;
        System.out.println("O carro foi ligado!");
    }

    void desligado(){
        this.ligado = false;
        this.velocidade = 0;
        System.out.println("O carro foi desligado!");
    }

    void acelerar(int valor){
        if(this.ligado){
            this.velocidade += valor;
            System.out.println("Acelerou " + valor + " km/h.");
        } else{
            System.out.println("Não é possível acelerar o carro, está desligado.");
        }
    }

    void frear(int valor){
        this.velocidade -= valor;
        if (velocidade < 0){
            this.velocidade = 0;
        }

        System.out.println("O carro freou " + valor + "km/h.");
    }
}