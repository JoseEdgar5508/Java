package secao8;

public class Funcao {
    public static void main(String[] args) {
        
        // 1- criando a primeria função
        // tanto funções quanto váriaveis a fente nomeia
        saudacao();
        saudacao();

        System.out.println("-------------------------");

        // 2- parametros
        soma(2, 4);
        soma(5, 7);

        saudar("Mathus");

        System.out.println("---------------------------");

        // 3- return
        dobrar(4);

        int numero = 10;

        int numeroDobrar = dobrar(numero);

        System.out.println("O número dobrado é: " + numeroDobrar);

        System.out.println(dobrar(10));

        System.out.println("-------------------------------");

        // 4- retorno em variavel
        String r1 = verificarPar(numero);

        String r2 = verificarPar(3);
       
        System.out.println(r1);
        
        System.out.println(r2);

        int x = dobrar(soma2(2, 4));

        System.out.println(x);


    }
    
    // NIVEL DE ACESSO, STATIC => não preciso estanciar a classe para exercutar, TIPO DE RETORNO
    // NOME PARENTESES (ARGN), BLOCO{}
    public static void saudacao(){

        System.out.println("Olá, está é a minha primerira função!");


    }

    public static void soma(int a, int b){
        int resultado = a + b;
        System.out.println("O resultado da soma é: " + resultado);

    }

    public static void saudar(String nome){

        System.out.println("Olá, " + nome + ", tudo bem!");


    }

    // parametros de funções defirentes podem ter o mesmo nome

    public static int dobrar(int n) {
        return n * 2;
    }

    public static String verificarPar(int n){
        if(n % 2 == 0){
            return "O número " + n + " é par!";
        }else{
            return "O número " + n + "  NÃO é par!";
        }

    }

    public static int soma2(int a, int b){
        return a + b;
    }

}
