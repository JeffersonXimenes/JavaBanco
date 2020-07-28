package br.com.rd.rdevs.modelo;

public class Presidente extends Funcionario {

    private static int numeroDeFuncionarios;
    private String login;
    private int senha;


    public Presidente(String nome, String cpf, double salario, String login, int senha) {
        super(nome, cpf, salario);

        this.login = login;
        this.senha = senha;
    }

    @Override
    public double bonificacao() {
        return getSalario() * 1.2 + 600;
    }

    public void dadosPresidente() {
        System.out.println("Login: " + this.login);
        System.out.println("Senha: ***** ");



    }
}
