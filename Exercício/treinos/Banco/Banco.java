package Banco;

public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Banco(float s, boolean st){
        this.saldo = 0;
        this.status = false;
    }

    public void setnumConta(int n){
        this.numConta = n;
    }

    public int getnumConta(){
        return this.numConta;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public String getDono(){
        return this.dono;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean st){
        this.status = st;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);

        if (t.equals("CC")) {
           this.saldo = 50;
        }

        else if (t.equals("CP")) {
           this.saldo = 150;
        }
    }

    public void fecharConta(){
        if (this.getSaldo() > 0) {
           System.out.println("ERRO! Conta com saldo positivo. Retire seu dinheiro para fechar a conta.");
        } 
        else if (this.getSaldo() < 0) {
           System.out.println("ERRO! Conta em débito. Pague o saldo devedor para fechar a conta.");
        }   
        else {
           this.setStatus(false); 
           System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v){
        if (status == true){
            setSaldo(getSaldo() + v);
        } 
        else{
            System.out.println("Impossivel depositar.");
        }
    }

    public void sacar(float v){
        if (status == true){
            if ( saldo > v){
                saldo = saldo - v;
            } else{
                System.out.println("Saldo insuficiete.");
            }
        } else{
            System.out.println("impossivel sacar.");
        }
    }

    public void pagarMesal(){
        float v = 0;

        if(tipo.equals("CC")){
            v = 12;
        } else if(tipo.equals("CP")){
            v = 20;
        }

        if (status == true){
            if(saldo > v){
                saldo = saldo - v;
            } else{
                System.out.println("Saldo insuficente.");
            }
        } else{
            System.out.println("Impossivel sacar.");           
        }
    }
}
