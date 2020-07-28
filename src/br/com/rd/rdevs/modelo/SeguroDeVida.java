package br.com.rd.rdevs.modelo;

public class SeguroDeVida implements Tributavel {
    private String titular;
    private double valorSeguro;
    private double taxa;
    private int numeroApolice;

    // CONSTRUTOR SÓ COM OS "PRINCIPAIS"
    public SeguroDeVida(String titular, double valorSeguro, double taxa) {
        this.titular = titular;
        this.valorSeguro = valorSeguro;
        this.taxa = taxa;
    }

    // CONSTRUTOR COMPLETO
    public SeguroDeVida(String titular, double valorSeguro, double taxa, int numeroApolice) {
        this.titular = titular;
        this.valorSeguro = valorSeguro;
        this.taxa = taxa;
        this.numeroApolice = numeroApolice;
    }

    // GET TITULAR
    public String titular() {
        return this.titular;
    }

    // SET TITULAR
    public void setTtitular (String titular) {
        this.titular = titular;
    }

    // GET VALOR SEGURO
    public double getSeguro() {
        return valorSeguro;
    }

    // SET VALOR SEGURO
    public void setValorSeguro (double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    // GET TAXA
    public double getTaxa() {
        return taxa;
    }

    // SET TAXA
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    // GET NUMERO APOLICE
    public int getNumeroApolice() {
        return numeroApolice;
    }

    // SET NUMERO APOLICE
    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    // DADOS SEGURO DE VIDA
    public void dadosSeguro() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Valor Seguro: " + this.valorSeguro);
        System.out.println("Valor Taxa: " + this.taxa);
        System.out.println("Número Apolice: " + this.numeroApolice);

    }

    @Override
    public double getValorImposto() {
        return taxa + valorSeguro;
    }
}
