package banco4;

public class TesteBanco {
    public static void main(String[] args) {

        Banco banco = new Banco();

        System.out.println("----------------- CRIAÇÃO DE CONTAS BANCÁRIAS -----------------\n");

        System.out.println("Criando uma conta poupança para o cliente Bruno Henrique com saldo de R$ 50.000,00 e taxa de rendimento de 3%.");
        Cliente b = new Cliente("Bruno", "Henrique");
        ContaPoupanca contab = new ContaPoupanca(50000, 3);
        b.setConta(contab);

        System.out.println("Criando uma conta corrente para o cliente Everton Ribeiro com saldo de R$ 45.000,00 e cheque especial de R$ 30.000,00.");
        Cliente e = new Cliente("Everton", "Ribeiro");
        ContaCorrente contae = new ContaCorrente(45000, 30000);
        e.setConta(contae);

        System.out.println("Criando uma conta corrente para o cliente Filipe Luiz com saldo de R$ 70.000,00 e sem cheque especial.");
        Cliente f = new Cliente("Filipe", "Luiz");
        ContaCorrente contaf = new ContaCorrente(70000);
        f.setConta(contaf);

        System.out.println("Criando uma conta poupança para o cliente Gabriel Barbosa com saldo de R$ 220.000,00 e taxa de rendimento de 3%.");
        Cliente g = new Cliente("Gabriel", "Barbosa");
        ContaPoupanca contag = new ContaPoupanca(220000, 3);
        g.setConta(contag);

        System.out.println("Criando uma conta corrente para o cliente Diego Alves com saldo de R$ 50.000,00 e sem cheque especial.");
        Cliente d = new Cliente("Diego", "Alves");
        ContaCorrente contad = new ContaCorrente(50000);
        d.setConta(contad);

        System.out.println("Diego Alves autorizou o cadastro de sua conta corrente como sendo conjunta com a cliente Lorena Lara.");
        Cliente l = new Cliente("Lorena", "Lara");
        l.setConta(contad);

        banco.adicionarCliente(b);
        banco.adicionarCliente(e);
        banco.adicionarCliente(f);
        banco.adicionarCliente(g);
        banco.adicionarCliente(d);
        banco.adicionarCliente(l);


        System.out.println();
        System.out.println("----------------- RELATÓRIO DE TRANSAÇÕES ------------------");

        System.out.println("Recuperando o cliente " + banco.getCliente(0).getNome() + " " + banco.getCliente(0).getSobrenome() +
                "\nSacando R$ 1.200,00: " + contab.sacar(1200) +
                "\nDepositando R$ 8.525,00: " + contab.depositar(8525) +
                "\nSacando R$ 12.800,00: " + contab.sacar(12800) +
                "\nSacando R$ 50.000,00: " + contab.sacar(50000) +
                "\nCliente [Bruno, Henrique] tem o saldo de R$ " + banco.getCliente(0).getConta().getSaldo() + "\n");

        System.out.println("Recuperando o cliente " + banco.getCliente(1).getNome() + " " + banco.getCliente(1).getSobrenome() +
                "\nSacando R$ 12.500,00: " + contae.sacar(12500) +
                "\nSacando R$ 18.500,00: " + contae.sacar(18500) +
                "\nDepositando R$ 3.500,00: " + contae.depositar(3500) +
                "\nSacando R$ 17.000,00: " + contae.sacar(17000) +
                "\nSacando R$ 25.000,00: " + contae.sacar(25000) +
                "\nCliente [Everton, Ribeiro] tem o saldo de R$ " + banco.getCliente(1).getConta().getSaldo() + "\n");

        System.out.println("Recuperando o cliente " + banco.getCliente(2).getNome() + " " + banco.getCliente(2).getSobrenome() +
                "\nSacando R$ 25.500,00: " + contaf.sacar(25500) +
                "\nDepositando R$ 2.000,00: " + contaf.depositar(2000) +
                "\nSacando R$ 37.200,00: " + contaf.sacar(37200) +
                "\nSacando R$ 15.000,00: " + contaf.sacar(15000) +
                "\nCliente [Filipe, Luis] tem o saldo de R$ " + banco.getCliente(2).getConta().getSaldo() + "\n");

        System.out.println("Recuperando o cliente " + banco.getCliente(3).getNome() + " " + banco.getCliente(3).getSobrenome() +
                "\nSacando R$ 15.500,00: " + contag.sacar(15500) +
                "\nDepositando R$ 3.000,00: " + contag.depositar(3000) +
                "\nSacando R$ 23.400,00: " + contag.sacar(23400) +
                "\nSacando R$ 17.000,00: " + contag.sacar(17000) +
                "\nCliente [Gabriel, Barbosa] tem o saldo de R$ " + banco.getCliente(3).getConta().getSaldo() + "\n");

        System.out.println("Recuperando o cliente " + banco.getCliente(4).getNome() + " " + banco.getCliente(4).getSobrenome() +
                "\nSacando R$ 28.000,00: " + contad.sacar(28000) +
                "\nDepositando R$ 3.000,00: " + contad.depositar(3000) +
                "\nSacando R$ 17.000,00: " + contad.sacar(17000) +
                "\nCliente [Diego, Alves] tem o saldo de R$ " + banco.getCliente(4).getConta().getSaldo() + "\n");

        System.out.println("Recuperando o cliente " + banco.getCliente(5).getNome() + " " + banco.getCliente(5).getSobrenome() +
                "\nSacando R$ 32.000,00: " + contad.sacar(32000) +
                "\nDepositando R$ 13.000,00: " + contad.depositar(13000) +
                "\nSacando R$ 16.600,00: " + contad.sacar(16600) +
                "\nCliente [Lorena, Lara] tem o saldo de R$ " + banco.getCliente(5).getConta().getSaldo());
    }
}