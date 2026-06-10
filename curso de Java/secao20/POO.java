package secao20;

public class POO {
    
    public static void main(String[] args) {
        
        //1- Object Composition
        Motor motor1 = new Motor("v8", 450);

        Carro carro1 = new Carro("Ford", "Mustang", motor1);

        carro1.exibirInfo();

        //2- Herança
        Cachorro turca = new Cachorro("Turca");

        turca.latir();

        turca.emitirSom();

        Animal leao = new Animal("Shark");

        leao.emitirSom();

        //a subclasse tem acesso a tudo da classe superclasse
        //e a superclasse NÃO tem acesso a classe filha

        // 3- A Classe Object

        Pessoa Edgar = new Pessoa("Edgar", 20);
        Pessoa Joao = new Pessoa("João", 30);

        System.out.println(Edgar.toString());
        System.out.println(Edgar.equals(Joao));
        System.out.println(Edgar.hashCode());

        // 4- Override
        Quadrado q1 = new Quadrado(4);
        Circulo c1 = new Circulo(3.2);

        System.out.println(q1.calcularArea());
        System.out.println(c1.calcularArea());

        // 5- Super
        Funcionario funcionario = new Funcionario("Carlor", 3000);

        Gerente gerente = new Gerente("Marcos", 5000, 1000);

        funcionario.exibirDetalhes();

        gerente.exibirDetalhes();

        System.out.println(funcionario.calcularBonus());

        System.out.println(gerente.calcularBonus());

        // 6- Classe abstrata
        instrumentoMusical violao = new violao("Violão");
        instrumentoMusical bateria = new bateria("bateria");

        violao.exibirDetalhes();
        bateria.exibirDetalhes();

        violao.tocar();
        bateria.tocar();

        // 7- Interfaces
        Pagamento cartao = new CartaoCredito();
        Pagamento transf = new TransferenciaBancaria();

        cartao.processarPagamento(100);
        cartao.exibirRecibo(100);

        transf.processarPagamento(250);
        transf.exibirRecibo(250);

        // 8- Múltiplas Interfaces
        Documento doc = new Documento("Arquivo de texto.");

        doc.salvar();

        doc.imprimir();

        doc.instrucaoParaSalvar();

        // 9- Métodos com Default
        CalculadoraAvancada calc = new CalculadoraAvancada();

        System.out.println(calc.somar(2, 4));

        System.out.println(calc.multiplicar(4 , 5));

        // 10- Polimorfismo
        // classes abstratas ou interfaces -> sobreescrever os métodos destas superclasses
        instrumentoMusical violino = new Violino("violino");

        violino.exibirDetalhes();

        violino.tocar();

    }

}
