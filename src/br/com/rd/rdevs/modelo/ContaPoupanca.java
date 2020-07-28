package br.com.rd.rdevs.modelo;

public class ContaPoupanca extends Conta {

    protected double taxa = 0.1 * this.saldo;
    protected double seguraVida = 42 * 1.02;
    protected double total = taxa + seguraVida;

    private ContaPoupanca tipoConta;

    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    public ContaPoupanca(int numero, String titular) {
        super(numero, titular);
    }

    @Override
    public Conta getTipoConta() {
        return tipoConta;
    }

    @Override
    public void getTipo() {
        System.out.println("Conta-Poupança");
    }

    @Override
    public double getValorImposto() {
        return total;
    }


}
