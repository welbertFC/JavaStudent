public class TestaBanco {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "paulo da silva";
        paulo.cpf = "222.121.121-23";
        paulo.profissao = "pedreiro";

        Cliente maria = new Cliente();
        maria.nome = "maria das dores";
        maria.cpf = "130.154.145-23";
        maria.profissao = "cozinheira";
        maria.telefone = 98989898;

        Conta contaMaria = new Conta();
        contaMaria.titular = maria;
        contaMaria.depositar(300);



        Conta contadoPaulo = new Conta();
        contadoPaulo.titular = paulo;
        contadoPaulo.depositar(100);

        System.out.println(contadoPaulo.titular.nome);
        System.out.println(contadoPaulo.saldo);

        System.out.println(contaMaria.titular.nome);
        System.out.println(contaMaria.saldo);

        contaMaria.transfere(500, contadoPaulo);

        System.out.println(contadoPaulo.titular.nome);
        System.out.println(contadoPaulo.saldo);



    }
}
