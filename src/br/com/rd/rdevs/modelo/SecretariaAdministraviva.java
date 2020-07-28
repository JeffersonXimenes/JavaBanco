package br.com.rd.rdevs.modelo;

public class SecretariaAdministraviva extends Secretaria {

    public SecretariaAdministraviva(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }


    public SecretariaAdministraviva(String nome, String cpf, double salario, String login, int senha) {
        super(nome, cpf, salario, login, senha);
    }

    public SecretariaAdministraviva() {

    }

    @Override
    public double bonificacao() {
        return 0;
    }
}
