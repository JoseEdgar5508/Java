package secao19;
import java.util.Scanner;

public class Aluno {
    
    //Criando as propriedades.
    private String nome;
    private String matricula;
    private double[] notas;

    //Construtor
    public Aluno(String nome, String matricula, int numerosDeNotas){

        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[numerosDeNotas];

    }

    public String getNome(){
        return nome;
    }

    //Adicionando notas ao Array de notas do aluno.
    public void adicionarNotas(Scanner scanner){

        System.out.println("Digte as notas para o aluno " + nome + ":");

        for(int i = 0; i < notas.length; i++){

            System.out.println("Digte a nota " + (i + 1) + ":");

            notas[i] = scanner.nextDouble();

        }

    }

    //Calculando a media de notas.
    public double calcularMedia(){
        double soma = 0;

        for(double nota : notas){
            soma += nota;
        }

        return soma / notas.length;
    }

    //Mostrando se aluno passou ou não.
    public void exibirResultado(){

        double media = calcularMedia();

        System.out.println("Nome: " + nome);
        System.out.println("Matricula " + matricula);
        System.out.println("Média final " + media);

        if(media >= 6){
            System.out.println("O aluno foi aprovado ");
        } else{
            System.out.println("O aluno foi reprovado.");
        }

    }

}
