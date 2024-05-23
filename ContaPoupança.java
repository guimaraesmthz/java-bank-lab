public class ContaPoupança extends Conta {

    ContaPoupança(int numero, int agencia){
        super.Conta(numero,agencia);
    };

    @Override
    public void imprimirExtrato() {
        System.out.println("~~~~Conta Poupança~~~~");
        System.out.println("Extrato: "+"Saldo => "+super.getSaldo());
    };


}
