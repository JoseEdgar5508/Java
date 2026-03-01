package aula02;

public class POO {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;

        c1.tampar();
        c1.staus();
        c1.rabiscar();

        System.out.println("-------------------------------------------");

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";

        c2.destampar();
        c2.staus();
        c2.rabiscar();

    }
}
