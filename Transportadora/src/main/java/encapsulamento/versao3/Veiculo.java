package encapsulamento.versao3;

public class Veiculo {
    private double carga;
    private double cargaMaxima;

    public Veiculo(double cargaMaxima) {
        this.cargaMaxima = quilosParaNewtons(cargaMaxima);
    }

    public double getCarga() {
        return newtonsParaQuilos(carga);
    }

    public double getCargaMaxima() {
        return newtonsParaQuilos(cargaMaxima);
    }

    public boolean adicionarCaixa(double peso) {
        double pesoEmNewtons = this.carga + quilosParaNewtons(peso);
        if (pesoEmNewtons <= this.cargaMaxima) {
            this.carga = pesoEmNewtons;
            return true;
        }
        return false;
    }

    private double newtonsParaQuilos(double peso) {
        return peso / 9.8;
    }

    private double quilosParaNewtons(double peso) {
        return peso * 9.8;
    }
}


