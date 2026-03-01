package secao17;

public class Exercicio {

    public static void main(String[] args) {

        // Exercício 1

        Celular iphone = new Celular();

        iphone.marca = "Apple";
        iphone.modelo = "Iphone 15";

        iphone.ligar();

        iphone.desligar();

        iphone.usar(50);

        System.out.println("----------------------------------------");

        // Exercíco 2

        Aluno Pedro = new Aluno("Pedro", 333, 33.3);

        System.out.println(Pedro.getNome());

        System.out.println(Pedro.getNotaFinal());

        Pedro.setNome("Pedro Alves");

        Pedro.setNotaFinal(50.0);

        Pedro.exibirInfo();

        System.out.println("--------------------------------------------");

        // Exercício 4

        ProdutoEletronico microondas = new ProdutoEletronico("Microondas", 400, 12);

        microondas.aplicarDesconto(15);

        microondas.exibirInfo();

        System.out.println("--------------------------------------------");

        // Exercício 5

        LivroBiblioteca livor1 = new LivroBiblioteca();

        livor1.setTitulo("Java como programar.");

        livor1.devolver();

        livor1.pegarEmprestado();

        livor1.pegarEmprestado();

        livor1.devolver();

    }
    
}
