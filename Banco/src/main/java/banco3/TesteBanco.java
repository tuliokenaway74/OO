package banco3;

public class TesteBanco {
    public static void main(String[] args) {

        Banco banco = new Banco();

        Cliente b = new Cliente("Bruno", "Henrique");
        Conta contab = new Conta(50000);
        b.setConta(contab);

        Cliente e = new Cliente("Everton", "Ribeiro");
        Conta contae = new Conta(45000);
        e.setConta(contae);

        Cliente f = new Cliente("Filipe", "Luiz");
        Conta contaf = new Conta(70000);
        f.setConta(contaf);

        Cliente g = new Cliente("Gabriel", "Barbosa");
        Conta contag = new Conta(220000);
        g.setConta(contag);

        Cliente d = new Cliente("Diego", "Alves");
        Conta contad = new Conta(50000);
        d.setConta(contad);


        banco.adicionarCliente(b);
        banco.adicionarCliente(e);
        banco.adicionarCliente(f);
        banco.adicionarCliente(g);
        banco.adicionarCliente(d);

        for (int i = 0; i < banco.getNumeroDeClientes(); i++) {

            System.out.println("Cliente [" + (i + 1) + "] : " + banco.getCliente(i).getNome() + " " + banco.getCliente(i).getSobrenome() + "." + " Saldo R$:" + banco.getCliente(i).getConta().getSaldo());
        }

//        System.out.println("O saldo da conta é R$ " + contab.getSaldo());

    }
}
