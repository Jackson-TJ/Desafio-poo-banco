public class Main {

    public static void main(String[] args) {

        Cliente venilton = new Cliente();
        venilton.setNome("Jackson");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(150);
        cc.transferir(25, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}