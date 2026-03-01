package TesteControle;

public class TesteControle {
    public static void main(String[] args) {

        ControleRemoto cr1 = new ControleRemoto();

        cr1.cor = "Preto";
        cr1.numButoes = 15;

        cr1.ligar();
        cr1.status();
        cr1.apertar();

        System.out.println("---------------------------------------------------------");

        ControleRemoto cr2 = new ControleRemoto();

        cr2.marca = "Samsung";
        cr2.cor = "Cinza";

        cr2.desligar();
        cr2.status();
        cr2.apertar();
    }
}
