package br.com.rd.rdevs.modelo;

public abstract class Conta implements Comparable<Conta>{
    protected int numero;
    protected String titular;
    protected double saldo;
    protected double rendimento;
    protected static int contador = 0;
    private String dataAbertura;

    public Conta(int numero, String titular, double saldo) {
        contador++;
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(int numero, String titular) {
        contador++;
        this.numero = numero;
        this.titular = titular;
    }


    public int compareTo(Conta outraConta) {
        if (this.saldo < outraConta.saldo) {
            return -1;
        }
        if (this.saldo > outraConta.saldo) {
            return 1;
        }
        return 0;
        //return this.titular.compareTo(outraConta.titular);
    }

    public int compareTo2(Conta outraConta) {
        return this.titular.compareTo(outraConta.titular);

    }



    public boolean sacar(double valorSacado) {
        if (this.saldo < valorSacado && valorSacado < 0) {
            return false;
        } else {
            this.saldo = this.saldo - valorSacado;
            return true;
        }

    }

    public boolean depositar(double valorDepositado) {
        try {
            this.saldo += valorDepositado;
            return true;
            } catch (IllegalArgumentException e) {
                System.out.println("ERRO:" + e);
                return false;
            }
        }

    public void transferir(double valor, Conta destino) {
        if(valor > 0 && this.saldo > valor){

            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Voce transferiu R$: " + valor + " Para " + destino);

        }else {
            System.out.println("Problemas com a conta");
        }
    }

    public void calcularRendimento() {
        rendimento = this.saldo * 0.1;
        System.out.println(rendimento);
    }

    public abstract Conta getTipoConta();

    public void setTipoConta(Conta conta) {
    }

    public int getNumerosContasAbertas() {
        System.out.println("Total de contas Abertas: " + this.contador);
        return this.contador;
    }

    public void recuperarDadosParaImpressao() {
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Nome do Titular: " + this.titular);
        System.out.println("Saldo da conta: R$ " + this.saldo);
        System.out.println("Rendimento da conta: R$ " + this.rendimento);
        System.out.println("Data de Abertura: " + this.dataAbertura);



    }

    // USADO PARA TESTE
    public void dadosConta() {
        System.out.println("Titular: " + this.titular);
        System.out.println("  Conta: " + this.numero);

    }

    public abstract void getTipo();

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getRendimento() {
        return rendimento;
    }

    public static int getIdentificador() {
        return Conta.contador;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public abstract double getValorImposto();

    public String getDataDeAbertura() {
        return dataAbertura;
    }

}
