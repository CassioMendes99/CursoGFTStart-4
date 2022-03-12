public class Main {

    public static void main(String[] args) {

        Cliente cassio=new Cliente();
        cassio.setNome("Cassio");

        Conta cc=new ContaCorrente(cassio);
        Conta cp=new ContaPoupança(cassio);

        cc.depositar(100);
        cc.transferir(100,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
