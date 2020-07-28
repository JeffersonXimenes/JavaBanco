package br.com.rd.rdevs.main;


import br.com.rd.rdevs.modelo.Conta;
import br.com.rd.rdevs.modelo.ContaCorrente;

import java.util.HashMap;
import java.util.Map;

public class TesteMapa {
    public static void main(String[] args) {

        Conta c1 = new ContaCorrente(1222, "Google");
        c1.depositar(10000);

        Conta c2 = new ContaCorrente(7070, "Chrome");
        c2.depositar(3000);

        // cria o mapa
        Map mapaDeContas = new HashMap();

        // adiciona duas chaves e seus valores
        mapaDeContas.put("diretor", c1);
        mapaDeContas.put("gerente", c2);


        // qual a conta do diretor?
        Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
        System.out.println(contaDoDiretor.getSaldo());
    }
}


