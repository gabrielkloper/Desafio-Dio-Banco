public class Main {
    public static void main(String[] args) {
        Cliente gabriel = new Cliente();
        gabriel.setNome("Gabriel");


        Conta cc = new ContaCorrente(gabriel);
        cc.depositar(1000);

        Conta poupanca = new ContaPoupanca(gabriel);
        cc.transferir(500, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}