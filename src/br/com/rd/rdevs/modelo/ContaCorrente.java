package br.com.rd.rdevs.modelo;

public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int numero, String titular) {
        super(numero, titular);

    }

    private ContaCorrente tipoConta;

    @Override
    public boolean sacar(double valorSacado) {
        if (this.saldo < valorSacado && valorSacado < 0) {
            return false;
        } else {
            this.saldo = this.saldo - valorSacado - 0.10;
            return true;
        }
    }

    @Override
    public Conta getTipoConta() {
        return tipoConta;
    }

    @Override
    public void getTipo() {
        System.out.println("Conta-Corrente");
    }

    @Override
    public double getValorImposto() {
        return 0;
    }

}
