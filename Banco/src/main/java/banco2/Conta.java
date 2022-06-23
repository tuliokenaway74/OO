package banco2;

public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor){
        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if(valor > this.saldo){
            return false;
        }else {
            this.saldo -= valor;
            return true;
        }
    }
}