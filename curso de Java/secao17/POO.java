package secao17;

public class POO {
    
    public static void main(String[] args) {
        // Criar classe foi a criação de Carro.java

        // Aula de agora, instanciar a classe
        Carro fusca = new Carro();

        // Acessar props e métodos sintaxe
        // NOMEOBJETO.PROP e NOMEOBJETO.METODO()
        fusca.marca = "VW";
        fusca.modelo = "Fusca";
        fusca.ano = 1964;

        fusca.acelerar();
        fusca.exibirInfo();

        Carro gol = new Carro();

        gol.marca = "VW";
        gol.modelo = "Gol";
        gol.ano = 2010;

        gol.acelerar();
        gol.exibirInfo();

        System.out.println("---------------------------------------------");

        // 3- Métodos 

        fusca.aumentarVelocidade(10);

        fusca.ligarMotor();

        fusca.aumentarVelocidade(20);

        fusca.aumentarVelocidade(30);

        System.out.println(fusca.motorLigado);

        System.out.println("-----------------------------------------");

        // 4- criando propriedades 
        Pessoa joão = new Pessoa();

        // RPOTEGIDO: joão.nome = "João";
        joão.setNome("João.");

        System.out.println("O nome do Jaõa é: " + joão.getNome());

        joão.setIdade(33);

        System.out.println("A idade do João é: " + joão.getIdade());

        System.out.println("--------------------------------------------");

        // 5- setters
        ContaBancaria ContaDaAna = new ContaBancaria();

        ContaDaAna.setTitular("Ana");

        ContaDaAna.setSaldo(1000);

        ContaDaAna.exibirInfo();

        System.out.println(ContaDaAna.getTitular());

        System.out.println(ContaDaAna.getSaldo());

        System.out.println("---------------------------------------");

        // 6- lógica de get e set

        Produtos camisa = new Produtos();

        camisa.setNome("Camisa regata.");

        System.out.println(camisa.getNome());

        camisa.setPreço(33);

        System.out.println(camisa.getPreço());

        System.out.println("---------------------------------------");

        // 7- Método dentro de método
        System.out.println(camisa.getProdutoInfo());

        camisa.aplicarDesconto(10);

        System.out.println("---------------------------------------");

        // 8- Construtores

        Livro meuLivro = new Livro("Entre as arvóres rosas", "José Edgar", 31.90);

        meuLivro.exibirInfo();

        Livro meuLivro2 = new Livro();

        meuLivro2.exibirInfo();

        System.out.println("---------------------------------------------");

        





    }
}
