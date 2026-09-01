package Ebook200exercícios.Capítulo1;

/*
Escreva um programa que converta um valor double em int e outro valor int em double.
Exiba os resultados das conversões e explique a diferença entre conversão explícita e
implícita.
Dica: procure por type casting em Java.
*/

public class ex4 {
    public static void main(String[] args) {
        // Conversão implícitaOcorre automaticamente quando você converte um 
        // tipo menor para um maior, sem perda de dados: 

        int x = 9;
        double y = x;

        System.out.println(y);

        // Converção explicíta Você força a conversão manualmente, podendo haver perda de dados:

        double a = 9.99;
        int b = (int) a;

        System.out.println(b);

    }
}
