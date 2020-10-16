public class TestaBanco {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.setNome("paulo da silva");
        paulo.setCpf("4546446465464");
        paulo.setProfissao("pedreirp");

//        Cliente maria = new Cliente();
//        maria.nome = "maria das dores";
//        maria.cpf = "130.154.145-23";
//        maria.profissao = "cozinheira";
//        maria.telefone = 98989898;
//
//        Conta contaMaria = new Conta();
//        contaMaria.titular = maria;
//        contaMaria.depositar(300);



        Conta contadoPaulo = new Conta(0,0,0,null);
        contadoPaulo.setTitular(paulo);
        contadoPaulo.depositar(100);

        System.out.println(contadoPaulo.getTitular().getNome());
        System.out.println(contadoPaulo.getSaldo());

//        System.out.println(contaMaria.titular.nome);
//        System.out.println(contaMaria.getSaldo());
//
//        contaMaria.transfere(500, contadoPaulo);

        System.out.println(contadoPaulo.getTitular().getNome());
        System.out.println(contadoPaulo.getSaldo());

        Conta conta = new Conta(0,0,0,null );
        conta.depositar(2);
        System.out.println(conta.getSaldo());



    }
}
