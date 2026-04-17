package Faculdade.Exercício2;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "windows-1252");

        System.out.println("Digite sim ou não para a seguinte pergunta.");

        int i = 0;
        int quantidade_sim = 0;
        int quantidade_não = 0;

        do{
            System.out.println("Você gosta de beterraba?");
            String resposta = scanner.nextLine();

            if(resposta.equalsIgnoreCase("Sim")){
                quantidade_sim++;
                i++;
            }else if(resposta.equalsIgnoreCase("Não") || resposta.equalsIgnoreCase("nao")){
                quantidade_não++;
                i++;
            }else{
                System.out.println("Resposta não aceita.");
            }
        }while(i < 5);

        System.out.println("A quantidade de respostas 'sim' foi: " + quantidade_sim);
        System.out.println("A quantidade de respostas 'não' foi: " + quantidade_não);

        scanner.close();
    }
}
