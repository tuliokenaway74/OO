package encapsulamento.versao2;

public class TesteVeiculo2 {
    public static void main(String[] args) {
        System.out.println("Criando um veículo com carga máxima de 10.000kg.");

        Veiculo v1 = new Veiculo(10000);

        System.out.println("Adicionando caixa número 1 (500kg) : " + v1.adicionarCaixa(500));
        System.out.println("Adicionando caixa número 2 (250kg) : " + v1.adicionarCaixa(250));
        System.out.println("Adicionando caixa número 3 (5000kg) : " + v1.adicionarCaixa(5000));
        System.out.println("Adicionando caixa número 4 (4000kg) : " + v1.adicionarCaixa(4000));
        System.out.println("Adicionando caixa número 5 (300kg) : " + v1.adicionarCaixa(300));
        System.out.println("A carga do veículo é :" + v1.getCarga() + " kg");
    }
}
