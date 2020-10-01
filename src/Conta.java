public class Conta {

    double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public void depositar(double valor) {

        this.saldo = this.saldo + valor;

    }

    public void sacar(double valor) {

        if (valor >= this.saldo) {
            System.out.println("Não possui saldo suficiente seu saldo é: " + saldo);
        } else {

            this.saldo = this.saldo - valor;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            sacar(valor);
            destino.depositar(valor);
            return true;
        } else {

            double saldoNescessario = valor - this.saldo;
            System.out.println("saldo nescessario é de " + (saldoNescessario += saldo) + " Voce possui apenas " + saldo);
            return false;

        }


    }
}
