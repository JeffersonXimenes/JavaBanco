package br.com.rd.rdevs.modelo;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    protected double salario;

    private String login;
    private int senha;

    // CONSTRUTOR >> QUE VAI MANDAR PRO DIRETOR
    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    // CONSTRUTOR VAZIO
    public Funcionario() {

    }

    // CONSTRUTOR COMPLETO >> CRIEI POR CAUSA DE DIRETOR
    public Funcionario(String nome, String cpf, double salario, String login, int senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.login = login;
        this.senha = senha;
    }

    // AUTENTICA OU NAO
    public boolean autentica(int senha, String login) {
        if (this.senha == senha && login.equals(this.login)) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }


    public abstract double bonificacao();

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
