package encapsulamento.versao2;

public class Veiculo {
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

    public boolean adicionarCaixa(double carga) {
        double aux = this.carga + carga;
        if (aux <= cargaMaxima) {
            this.carga = aux;
            return true;
        }
        return false;
    }
}
