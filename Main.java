public class Main {

    public static void main(String[] args) {

        Conta conta1 = new ContaCorrente(2020,7);
        Conta conta2 = new ContaPoupança(2122,0);

        conta1.depositar(1000.00);
        conta2.depositar(500.00);

        conta1.transferir(350.00,conta2);

        conta2.imprimirExtrato();
        conta1.imprimirExtrato();

    };

}
