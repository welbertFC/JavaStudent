public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.depositar(100.88);

        System.out.println(conta.getSaldo());

        conta.sacar(2000);

        System.out.println(conta.getSaldo());


    }
    
}