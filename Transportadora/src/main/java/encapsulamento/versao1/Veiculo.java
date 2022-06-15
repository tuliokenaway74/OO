package encapsulamento.versao1;

public class Veiculo {
    private static int caixa = 0;
    private double carga;
    private double cargaMaxima;

    public Veiculo(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double getCarga() {
        return carga;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void adicionarCaixa(Veiculo v, double carga) {
        caixa++;
        v.carga = v.carga + carga;
        System.out.println("Adicionando caixa número " + caixa + " (" + carga + "kg)");
    }

    public void exibirCarga(Veiculo v) {
        System.out.println("A carga do veículo é :" + v.carga + " kg");
    }

//        public void adicionarCaixa(Veiculo v, double carga) {
//        caixa++;
//        v.carga = v.carga + carga;
//        System.out.println("Adicionando caixa número " + caixa + " (" + carga + "kg)");
//    }
}