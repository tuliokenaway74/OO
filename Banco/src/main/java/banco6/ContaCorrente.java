package banco6;

public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(double saldoInicial, double chequeEspecial) {
        super(saldoInicial);
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if(valor > this.saldo + this.chequeEspecial) {
            return false;
        }else {
            saldo = saldo - valor;
            return true;
        }
    }
}