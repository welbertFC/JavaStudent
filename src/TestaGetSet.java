public class TestaGetSet {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setNome("joao");
        cliente.setProfissao("pedreiro");
        cliente.setCpf("130.853.856-56");
        cliente.setTelefone(379997381);

        Conta conta = new Conta(0,0,0,null);
        Conta conta2 = new Conta(0,0,0,null);
        Conta conta3 = new Conta(0,0,0,null);
        conta.setTitular(cliente);

        conta.setNumero(-23);
        System.out.println(conta.getNumero());
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setNome("paulo joao");

        System.out.println(conta.getTitular().getNome());
        System.out.println(Conta.getTotal());

        
        
    }
    
}