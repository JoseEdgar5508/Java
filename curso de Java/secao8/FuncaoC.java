package secao8;

import java.util.Arrays;

import java.util.List;

public class FuncaoC {
    public static void main(String[] args) {
        
        // 12- Função recursiva
        int soma = somaRecursiva(6);
        // 6 + 5 + 4 + 3 + 2 + 1 = 21
        System.out.println(soma);

        // 13- Method Overloading

        System.out.println(soma(2, 4));
        System.out.println(soma(2, 4, 6));
        System.out.println(soma(2.2,4.4));

        // 14- Funções anônimas
        Runnable tarefa = () -> System.out.println("Minha fução anônima.");

        tarefa.run();

        //(arg1, arg2) -> {}

        List<String> nomes = Arrays.asList("Ana", "Pedro", "Paulo");

        nomes.forEach(nome -> System.out.println(nome));
    }

    public static int somaRecursiva(int n){

        if(n == 1){
            return 1;
        } else{
            return n + somaRecursiva( n - 1);
        }

    }

    public static int soma(int a, int b){
        return a + b;
    }

    public static int soma(int a, int b, int c){
        return a + b + c;
    }

    public static double soma(double a, double b){
        return a + b;
    }
}
