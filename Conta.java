public abstract class Conta implements InterfaceConta {

    public double getSaldo() {
        return saldo;
    };

    protected double saldo;
    protected int numero;
    protected int agencia;

    void Conta(int numero, int agencia){
        this.numero = numero;
        this.agencia = agencia;
    };

    void sacar(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso. Saldo atual: "+this.saldo);
        }else {
            System.out.println("Saldo insuficiente.");
        };
    };

    void depositar(double valor){
      this.saldo = this.saldo + valor;
      System.out.println("Depósito realizado com sucesso. Saldo atual: "+this.saldo);
    };

    void transferir(double valor, Conta conta){
        if(this.saldo >= valor){
            conta.depositar(valor);
            this.saldo = this.saldo - valor;
            System.out.println("Depósito realizado com sucesso.");
        }else{
            System.out.println("Saldo insuficiente.");
        }
    };


}
