package secao2;

public class variavel {

    public static void main(String[] args) {
        
        // 1- O que são variáveis.
        // tipo -> nome -> atribuir um valor.
        String nome = "Edgar";

        // nome => "Edgar";
        System.out.println(nome);

        // 2- Atribuição de variável com outra.
        String teste = "Teste";

        String testando = teste;

        System.out.println(testando);

        long numeroGrande = 999999999999999999L;

        //int numeroGrandeDois = numeroGrande;

        System.out.println(numeroGrande);

        // 3- comentários 

        /*
         linha 1
         linha 2
         linha 3
         */
        
         // 4- strings

         String primeiroNome = "José";

         String ultimoNome = "Edgar";

         System.out.println("José Edgar");

         System.out.println(primeiroNome + " " + ultimoNome);

         System.out.println("O nome dele é " + primeiroNome);

         String nomeCompleto = primeiroNome + " " + ultimoNome;

         System.out.println(nomeCompleto);

         // 5- char

         char letra = 'A';

         System.out.println(letra);

         // 6- int

         int n = 42;

         System.out.println(n);

         System.out.println(n + 5);

         System.out.println(n * 10);

         int soma = n + 12;

         System.out.println(soma);

         // 7- Long

         long populacaoMundial = 7000000000L;

         System.out.println(populacaoMundial);

         long numeroMaior = 1_000_000L;

         System.out.println(numeroMaior + 1);

         // 8- Double

         double preco = 19.99;

         System.out.println(preco);

         System.out.println(preco - 12);

         System.out.println(preco / 2);

         // 9- operadores aritmeticos.

         int soma2 = 12 + 4;

         System.out.println(soma2);

         System.out.println(22 + 4);

         System.out.println(20 - 5);

         System.out.println(10 * 5);

         System.out.println(10 / 2.5);

         System.out.println(10.0 / 2.5);

         // Para ter um resultado com casas decimais pelo menos um número tem que ser double.

         System.out.println(10 / 3);

         System.out.println(10.0 /3);

         System.out.println(10 % 3);

         // 10- Operadores aritmeticos p2

         int x = 5;

         x++;
         x++;
         x++;

         System.out.println(x);

         int y = 5;

         y--;

         System.out.println(y);

         int a = 10;

         a += 5;

         System.out.println(a);

         int b = 10;

         b -= 5;

         System.out.println(b);

         // 11- type casting

         //inplicito

         int numero2 = 42;

         long numeroLong = numero2;

         double numeroDouble = numero2;

         System.out.println(numeroLong);

         System.out.println(numeroDouble);

         //explicito

         double valorDouble = 9.78;

         int valorInt = (int) valorDouble;

         System.out.println(valorInt);

         // 12- Constantes
         final int Dias_Da_Semana = 7;

         System.out.println("Dias da semana " + Dias_Da_Semana);

         // 13- Var

         var z = 10;

         System.out.println(10);

         /* z = "teste"; 
         Ele inicializa variáveis sem declarar o tipo, e você 
         não pose tentar converter ele para um tipo deferente sem os metodos type casting */

         z = 5;

         System.out.println(z);

         var texto2 = "texto";

         var doubleteste = 2.0;

         System.out.println(texto2);

         System.out.println(doubleteste);

    }
}