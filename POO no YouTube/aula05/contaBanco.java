package aula05;

public class contaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("----------------------------------------");
        System.out.println("Número da conta " + this.getNumConta() + ".");
        System.out.println("Tipo da conta " + this.getTipo() + ".");
        System.out.println("Dono da conta " + this.getDono() + ".");
        System.out.println("Saldo da conta " + this.getSaldo() + ".");
        System.out.println("Status da conta " + this.getStatus() + ".");
    }

    public void abrirConta(String t){
       this.setTipo(t); 
       this.setStatus(true);
       if (t.equals("CC")) {
        this.setSaldo(50);
       } else if (t.equals("CP")){
        this.setSaldo(150);
       }
       System.out.println("Conta aberta com secesso!");
    }

    public void fecharConta(){
       if (this.getSaldo() > 0) {
        System.out.println("Conta não pode ser fechada, porque ainda tem dinhero.");
       } else if (this.getSaldo() < 0) {
        System.out.println("Conta não pode ser fechada, pois ainda tem débito.");
       } else{
        this.setStatus(false);
        System.out.println("Conta fechada com sucesso!");
       }
    }

    public void depositar(float v){
        if (this.getStatus()){
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realisado com sucesso, na conta de " + this.getDono() + ".");
        } else{
            System.out.println("Impossivel depositar em uma conta fechada!");
        }
    }

    public void sacar(float v){
        if (getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + getDono() + ".");
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada.");
        }
    }

    public void pagarMesal(){
       int v = 0;
       if (this.getTipo() == "CC") {
        v = 12;
       } else if (this.getTipo() == "CP"){
        v = 20;
       }
       if (getStatus()){
        this.setSaldo(this.getSaldo() - v);
        System.out.println("Mesalidade paga com sucesso por " + this.getDono() + ".");
       } else{
        System.out.println("Impossível pargar uma conta fechada!");
       }
    }

    public contaBanco(){
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
