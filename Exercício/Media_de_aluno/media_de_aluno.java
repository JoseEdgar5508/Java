package Media_de_aluno;

import java.util.Scanner;

public class media_de_aluno {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome.");

        String nome = scanner.nextLine();

        System.out.println("Agora as suas três notas.");

        int nota1 = scanner.nextInt();
        int nota2 = scanner.nextInt();
        int nota3 = scanner.nextInt();

        int resultado = (nota1 + nota2 + nota3) / 3;

        if(resultado > 7){
            System.out.println("Aprovado.");
        } else{
            System.out.println("Reprovado.");
        }

        System.out.println(nome + " sua media é " + resultado + ".");

        scanner.close();

    }
}
