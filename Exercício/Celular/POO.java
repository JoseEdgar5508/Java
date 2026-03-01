package Celular;

public class POO {
    public static void main(String[] args) {
        Celular c1 = new Celular();

        c1.setModelo("Samsung");
        c1.setDono("José");

        c1.estadoAtual();

        c1.ligar();
        c1.usar(5);
        c1.carregar(30);
        c1.desligar();

        c1.estadoAtual();
    }
}
