package Livro;

public class POO {
    public static void main(String[] args) {
        Livro c1 = new Livro("O amor.", "Edgar.", 50);

        c1.status();

        System.out.println("---------------------------------------------------");

        Livro c2 = new Livro("A paixão.", "Luísa", 150);

        c2.status();
    }
}
