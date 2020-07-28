package br.com.rd.rdevs.modelo;

public class SecretarioExecutivo extends Secretaria {

    public SecretarioExecutivo (String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    // CONSTRUTOR MEGA VAZIO
    public SecretarioExecutivo () {

    }

    // CASO JÁ QUEIRA COLOCAR A SENHA E LOGIN
    public SecretarioExecutivo (String nome, String cpf, double salario, String login, int senha) {
        super(nome, cpf, salario, login, senha);
    }

    @Override
    public double bonificacao() {
        return 0;
    }
}
