package aula10;

public class ProjetoPessoas {
    public static void main(String[] args) {
        //Porgrama principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cládio");
        p4.setNome("Fabiana");

        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        //p1.receberAumento(550.0f);
        //p2.mudarTrabalho();
        //p3.cancelarMat();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
