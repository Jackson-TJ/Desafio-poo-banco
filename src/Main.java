public class Main {

    public static void main(String[] args) {

        Cliente jackson = new Cliente();
        jackson.setNome("Jackson");

        Conta cc = new ContaCorrente(jackson);
        Conta poupanca = new ContaPoupanca(jackson);

        cc.depositar(150);
        cc.transferir(25, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}