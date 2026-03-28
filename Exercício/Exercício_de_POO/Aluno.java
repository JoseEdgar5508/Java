package Exercício_de_POO;

public class Aluno {
    private String nome;
    private int matricula;
    private double notaFinal;

    public Aluno(String nome, int matricula, double notaFinal){
        setNome(nome);
        this.matricula = matricula;
        setNotaFinal(notaFinal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.trim().isEmpty()){
            this.nome = nome;
        }else{
            System.out.println("Não está correto.");
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        if(notaFinal >= 0 && notaFinal <= 100){
            this.notaFinal = notaFinal;
        }else{
            System.out.println("Não exite esse nota.");
        }
    }

}
