import java.util.Formatter;

public abstract class Conta implements IConta{
    private static int Agencia_padrao=1;
    private static int Sequencial=1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia=Conta.Agencia_padrao;
        this.numero=Sequencial++;
        this.cliente=cliente;
    }

    @Override
    public void sacar(double valor) {
       saldo-=valor;
    }

    @Override
    public void depositar(double valor) {
        saldo+=valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
         this.sacar(valor);
         contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirinfoscomuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %2.f", this.saldo));
    }
}
