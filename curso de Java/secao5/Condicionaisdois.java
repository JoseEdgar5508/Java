package secao5;

public class Condicionaisdois {
    public static void main(String[] args) {
        
        // 1- condicional ternária

        int numero = 10;

        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.println(resultado);

        System.out.println("----------------------------------");

        // 2- if encadeado

        int idade = 25;
        boolean temCarteiara = true;

        if(idade >= 18){
            if(temCarteiara){
                System.out.println("Ele pode dirigir.");
            } else{
                System.out.println("Precisa de habilitação para dirigir.");
            }

        } else{
            System.out.println("Você não pose dirigier ainda!");
        }
        System.out.println("---------------------------------------");

        // 3- precedencia
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // true and false -> false or treu -> true
        boolean resultado2 = a && b || c;

        System.out.println(resultado2);

        // true or false -> true and true -> true
        boolean resultado3 = a || b && c;

        System.out.println(resultado3);

        // not (true or false) => not(true) => false and true => false
        boolean resultado4 = !(a && b) || c;

        System.out.println(resultado4);


    }
}
