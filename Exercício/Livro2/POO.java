package Livro2;

public class POO {
    public static void main(String[] args) {
        Livro c1 = new Livro("1984", "José Edgar", "Ficção", 356);

        c1.status();

        System.out.println("-----------------------------------------------------------");

        Livro c2 = new Livro("Spartacus", "Luísa", "Histórico", 450);

        c2.fechar();
        c2.status();
    }
}
