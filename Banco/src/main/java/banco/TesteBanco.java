package banco;

public class TesteBanco {
    public static void main(String[] args) {

        System.out.println("Criando uma conta com o saldo de R$ 1.000,00.");
        Conta c = new Conta(1000);

        System.out.println("Sacando R$ 250,00");
        c.sacar(250);

        System.out.println("Depositando R$ 350,50");
        c.depositar(320.5);

        System.out.println("Sacando R$ 120,00");
        c.sacar(120);

        System.out.println("O saldo da conta é R$ " + c.getSaldo());
    }
}
