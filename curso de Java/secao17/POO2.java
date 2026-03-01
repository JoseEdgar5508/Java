package secao17;

import java.util.Arrays;

public class POO2 {

    public static void main(String[] args) {
        // 1- Niveis de acesso
        Funcionário funcionário1 = new Funcionário("Mathues", 20000, "Teste123");

        funcionário1.exibirDados();

        funcionário1.nome = "Edgar";
        funcionário1.salário = 1500;
        //funcionário1.senha = "Teste456";

        funcionário1.exibirDados();

        funcionário1.aumentarSalario(10);

        //System.out.println(funcionário1.verificarSenha());

        if(funcionário1.autenticar("Teste123")){
            System.out.println("Usuário entrou no sistema.");
        }

        // 2- Classe imutável

        PessoaImuntavel Joaquim = new PessoaImuntavel("Joaquim", 23);

        System.out.println(Joaquim.getIdade());
        System.out.println(Joaquim.getNome());

        // Joaquim.nome = "Teste";

        // 3- Encapisulamento de Array

        String[] meusAlunos = {"Mathus", "João", "Maria"};

        Turma novaTurma = new Turma(meusAlunos);

        System.out.println(Arrays.toString(novaTurma.getAlunos()));

        String[] outrosAlunos = {"Alunos 1", "Alunos 2"};

        novaTurma.setAlunos(outrosAlunos);

        System.out.println(Arrays.toString(novaTurma.getAlunos()));


    }
    
}
