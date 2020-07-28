package br.com.rd.rdevs.main;

import br.com.rd.rdevs.modelo.Conta;
import br.com.rd.rdevs.modelo.ContaCorrente;
import br.com.rd.rdevs.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;


public class TesteArrays {
    public static void main(String[] args) {

        Conta[] contas = new Conta[4];
        double soma = 0.0;

        Conta c1 = new ContaCorrente(1220, "JEFFERSON");
        Conta c2 = new ContaCorrente(5445, "FREDERICO");
        Conta c3 = new ContaCorrente(9080, "GERSON");


        List<Conta> contagem = new ArrayList<>();
        contagem.add(c1);
        contagem.add(c2);
        contagem.add(c3);


        for (Conta a: contagem) {
            System.out.println(a.getNumero());
            System.out.println(a.getTitular());

        }

        /*
        for (int i = 0; i < contas.length; i++) {

            contas.depositar(i * 100.0);

            System.out.println(conta);
            // escreva o código para guardar a conta na posição i do array
        }

        // SET SALARIO
        */


    }

}
