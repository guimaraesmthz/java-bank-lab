public class ContaCorrente extends Conta{

    ContaCorrente(int numero, int agencia){
        super.Conta(numero,agencia);
    };

    @Override
    public void imprimirExtrato() {
        System.out.println("~~~~Conta Corrente~~~~");
        System.out.println("Extrato: "+"Saldo => "+super.getSaldo());
    };

}
