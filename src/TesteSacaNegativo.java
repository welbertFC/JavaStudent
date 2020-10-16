public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta(0,0,0,null);

        conta.depositar(100.88);

        System.out.println(conta.getSaldo());

        conta.sacar(2000);

        System.out.println(conta.getSaldo());


    }
    
}