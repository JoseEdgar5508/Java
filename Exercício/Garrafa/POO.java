package Garrafa;

public class POO {
    public static void main(String[] args) {
        Garrafa c1 = new Garrafa();

        c1.marca = "Gristal.";
        c1.cor = "Azul";
        c1.capacidade = 1;
        c1.quantidade = 1;
    
        c1.tampar();
        c1.status();
        c1.beber();
    }
}