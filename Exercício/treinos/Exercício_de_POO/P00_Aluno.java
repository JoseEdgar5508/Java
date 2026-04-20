package Exercício_de_POO;

public class P00_Aluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Edgar", 123, 100.0);

        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getMatricula());
        System.out.println(aluno1.getNotaFinal());
    }
}
