package br.com.rd.rdevs.main;

import br.com.rd.rdevs.modelo.Cliente;
import br.com.rd.rdevs.modelo.Conta;
import br.com.rd.rdevs.modelo.ContaCorrente;
import br.com.rd.rdevs.modelo.ContaPoupanca;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestaConta {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(5445, "Ximenes");        // 1° CONTA
        Conta c2 = new ContaCorrente(1220, "Malakoi");    // 2° CONTA
        Conta cp = new ContaPoupanca(7070, "Hebraico");   // 3° CONTA

        c2.depositar(12000);
        c2.transferir(10000, cc);
        cc.sacar(1000);

        c2.recuperarDadosParaImpressao();
        System.out.println("----------------------------");
        cc.recuperarDadosParaImpressao();
        System.out.println("----------------------------");
        System.out.println("Primeira Conta");
        cc.getTipo();
        System.out.println("----------------------------");
        System.out.println("Seggunda Conta Conta");
        cp.getTipo();
        System.out.println("----------------------------");
        cp.recuperarDadosParaImpressao();
        System.out.println("----------------------------");
        cc.getNumerosContasAbertas();

        /* testes aula
        Conta[] contas = new Conta[10];

        for (int i = 0; i < contas.length; i++) {
            Conta conta = new ContaCorrente(9090, "nombre");
            conta.depositar(i * 100.0);

            System.out.println(i);
            // escreva o código para guardar a conta na posição i do array
            //contas = arrayIntPush(5, contas);

        }
        // Exemplo de HashSet
        Set<String> conjunto = new HashSet<>();
        conjunto.add("teste 1");
        conjunto.add("teste 2");
        conjunto.add("teste 3");
        conjunto.add("teste 4");
        conjunto.add("teste 5");


        for (String texto : conjunto) {
            System.out.println(texto);
        }

        // ITERATOR
        Iterator<String> i = conjunto.iterator();
        while(i.hasNext()) {
            String texto = i.next();
            System.out.println(texto);
        }
        */
    }
}
