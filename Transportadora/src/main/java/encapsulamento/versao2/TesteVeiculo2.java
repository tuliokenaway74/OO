package encapsulamento.versao2;

public class TesteVeiculo2 {
    public static void main(String[] args) {
        System.out.println("Criando um veículo com carga máxima de 10.000kg.");

        Veiculo v1 = new Veiculo(10000);

        v1.adicionarCaixa(v1, 500);
        v1.adicionarCaixa(v1, 250);
        v1.adicionarCaixa(v1, 5000);
        v1.adicionarCaixa(v1, 4000);
        v1.adicionarCaixa(v1, 300);

        v1.exibirCarga(v1);
    }
}
