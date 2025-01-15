public class Main {
    public static void main(String[] args) {
        Cliente hugo = new Cliente();
        hugo.setNome("hugo");

        Conta cc = new ContaCorrente(hugo);
        Conta poupanca = new ContaPoupanca(hugo);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}