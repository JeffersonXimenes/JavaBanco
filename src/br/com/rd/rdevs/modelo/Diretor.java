package br.com.rd.rdevs.modelo;

public class Diretor extends Funcionario {

    private static int numeroDeFuncionarios = 0;
    private String login;
    private int senha;
    private String nome;

    public Diretor (String nome, String cpf, double salario, String login, int senha) {
        super(nome, cpf, salario);
        numeroDeFuncionarios++;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    // CONSTRUTOR VAZIO, VAI QUI
    public Diretor() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String nome) {
        this.login = login;
    }

    // POR QUESTÃO DE SEGURANÇA NÃO DEIXEI UM GET NA SENHA, PARA NINGUÉM PODE VER!
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public double bonificacao() {
        return getSalario() * 1.15 + 600;
    }

    public void imprimirDadosDiretor() {
        System.out.println(" Nome: " + this.nome);
        System.out.println("Login: " + this.login);
        System.out.println("Senha: ******");
    }
}
