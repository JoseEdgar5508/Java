package secao19;
import java.util.Scanner;

public class SistemaCadastroAluno {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Solicitar os números de alunos a serem cadastrados.
        System.out.println("Quantos alunos desejam cadastrar.");
        int numeroDeAlunos = scanner.nextInt();

        //Criação de arrays de launos.
        Aluno[] alunos = new Aluno[numeroDeAlunos];

        //Rodar o loop para cadastrar os alunos.
        for(int i = 0; i < numeroDeAlunos; i++){

            System.out.println("Cadastro de aluno " + (i + 1) + ":");

            System.out.println("Nome: ");
            String nome = scanner.next();

            System.out.println("Matricula: ");
            String matricula = scanner.next();

            System.out.println("Quantidade de provas: ");
            int numeroDeNotas = scanner.nextInt();
            scanner.nextLine();

            Aluno aluno = new Aluno(nome, matricula, numeroDeNotas);

            //Adicionar as notas.
            aluno.adicionarNotas(scanner);

            //Armazenar o aluno no Array.
            alunos[i] = aluno;
            
        }

        //Exibir os resultados.
        System.out.println("Resultados dos alunos:");
        for(Aluno aluno : alunos){
            aluno.exibirResultado();
            System.out.println();
        }

        scanner.close();

    }

}
