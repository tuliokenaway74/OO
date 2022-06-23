package banco3;

public class Conta {

    private double saldo;

    public Conta(double saldoInicial) {
        saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        saldo = saldo + valor;
        return true;
    }

    public boolean sacar(double valor) {
        if(valor > this.saldo) {
            return false;
        }else {
            saldo = saldo - valor;
            return true;
        }
    }


}