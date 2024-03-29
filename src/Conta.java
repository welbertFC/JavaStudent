import org.w3c.dom.ls.LSOutput;

public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;


    public Conta(double saldo, int agencia, int numero, Cliente titular) {
        Conta.total++;
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public void depositar(final double valor) {

        if(valor <= 0){
            System.out.println("não é possivel depositar valor menor que 1");
        }else {

            this.saldo = this.saldo + valor;
        }

    }

    public void sacar(final double valor) {

        if (valor >= this.saldo) {
            System.out.println("Não possui saldo suficiente seu saldo é: " + saldo);
        } else {

            this.saldo = this.saldo - valor;
        }
    }

    public boolean transfere(final double valor, final Conta destino) {
        if (this.saldo >= valor) {
            sacar(valor);
            destino.depositar(valor);
            return true;
        } else {

            double saldoNescessario = valor - this.saldo;
            System.out
                    .println("saldo nescessario é de " + (saldoNescessario += saldo) + " Voce possui apenas " + saldo);
            return false;

        }

    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {

        return this.numero;
    }

    public void setNumero(int numero) {
       
        if (numero < 0){
            System.out.println("Numero de conta não pode ser negativo");
            return;
        } else if(numero == 0){
            System.out.println("Numero de conta não pode ser 0");
            return;

        }else {
            this.numero = numero;
        }
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia < 0){
            System.out.println("Numero da agencia não pode ser negativo");
            return;
        } else if(agencia == 0){
            System.out.println("Numero da conta não pode ser 0");
            return;

        }else {
            this.agencia = agencia;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;

    }
}
