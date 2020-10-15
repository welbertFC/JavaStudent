public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular;

    public void depositar(final double valor) {

        this.saldo = this.saldo + valor;

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
        } else{

             this.numero = numero;
        }
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    
}
