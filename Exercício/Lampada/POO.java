package Lampada;

public class POO {
    public static void main(String[] args) {
        
        lampada c1 = new lampada();

        c1.marca = "Philips";
        c1.cor = "Branca";
        c1.voltagem = 60;

        c1.ligar();
        c1.status();
        c1.iluminar();
    }
}
