package Faculdade.Exercício3;
import java.util.Scanner;
/*8- Faça um programa que receba e conte votos para a seguinte enquete: “Você quer
ter aula na quarta-feira de cinzas?”. Caso o eleitor digite 1, seu voto será SIM; Caso
digite 2, será NÃO. O programa deverá repetir a operação até que o eleitor digite 0.
Ao final, exiba o total dos votos. */

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voto, votoSim = 0, votoNao = 0;

        do {
            System.out.println("\nVocê quer ter aula na quarta-feira de cinzas?");
            System.out.println("1 - SIM");
            System.out.println("2 - NÃO");
            System.out.println("0 - Encerrar votação");
            System.out.print("Digite seu voto: ");
            voto = scanner.nextInt();

            if (voto == 1) {
                votoSim++;
                System.out.println("Voto SIM registrado!");
            } else if (voto == 2) {
                votoNao++;
                System.out.println("Voto NÃO registrado!");
            } else if (voto != 0) {
                System.out.println("Voto inválido! Digite 1, 2 ou 0.");
            }

        } while (voto != 0);

        System.out.println("\n=== Resultado da Enquete ===");
        System.out.println("SIM: " + votoSim + " voto(s)");
        System.out.println("NÃO: " + votoNao + " voto(s)");
        System.out.println("Total: " + (votoSim + votoNao) + " voto(s)");
        scanner.close();
    }
}
