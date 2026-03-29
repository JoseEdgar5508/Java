package secao18;
import java.util.ArrayList;
import java.util.Scanner;

public class SimuladorLoteria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Bilhete> bilhetes = new ArrayList<>();

        //Solicitando bilhestes do usuário.
        while (true) {
            
            System.out.println("Digite 6 números para o seu bilhete (entre 1 e 60)");

            int[] numerosEscolhidos = new int[6];

            //Usuário escolhe números.
            for(int i = 0; i < numerosEscolhidos.length; i++){

                System.out.println("Digite o número " + (i + 1) + ": ");

                numerosEscolhidos[i] = scanner.nextInt();

            }

            //Criamos os bilhetes com os núemeros escolhidos.
            Bilhete bilhete = new Bilhete(numerosEscolhidos);

            bilhetes.add(bilhete);

            //Perguta se o usário quer continuar.
            System.out.println("Deseja registrar outro bilhete? (s/n");

            String resposta = scanner.next();

            if(resposta.equals("n")){
                break;
            }

        }

        //Realizar o sorteio para cada bilhete
        System.out.println("Realizando o sorteio...");

        for(Bilhete bilhete : bilhetes){
            bilhete.realizarSorteio();
            bilhete.exibirResultado();
        }

        scanner.close();

    }

}
