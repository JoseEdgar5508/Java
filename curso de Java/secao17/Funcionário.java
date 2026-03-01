package secao17;

public class Funcionário {

    public String nome;
    protected double salário;
    private String senha;

    public Funcionário(String nome, double salário, String senha){

        this.nome = nome;
        this.salário = salário;
        this.senha = senha;

    }

    public void exibirDados(){
        System.out.println("Nome: " + nome + ", salário " + salário + ", sneha " + senha);
    }

    protected void aumentarSalario(double porcentagem){
        this.salário += ((this.salário * porcentagem) / 100);
        System.out.println("O salário agora é de: " + salário);

    }

    private boolean verificarSenha(String tentativaSenha){
        return this.senha.equals(tentativaSenha);
    }

    public boolean autenticar (String tentativaSenha){
        // outras lógicas
        return verificarSenha(tentativaSenha);
   }


    
}
