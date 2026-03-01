package TesteControle;

public class ControleRemoto {
    String marca;
    String cor;
    int numButoes;
    int nivelBateria;
    boolean ligado;

    void status(){
        System.out.println("A marca do controle é: " + this.marca);
        System.out.println("A cor é: " + this.cor);
        System.out.println("O número de botões é: " + this.numButoes);
        System.out.println("O nível da bateria está em: " + this.nivelBateria);
        System.out.println("O controle está ligado? " + this.ligado);
    }

    void apertar(){
        if(this.ligado == true){
            System.out.println("Apertando botão");
        } else{
            System.out.println("ERRO! Controle desligado");
        }
    }

    void ligar(){
        this.ligado = true;
    }

    void desligar(){
        this.ligado = false;
    }
}
