package br.com.rd.rdevs.main;

import br.com.rd.rdevs.modelo.Banco;
import br.com.rd.rdevs.modelo.Conta;
import br.com.rd.rdevs.modelo.ContaCorrente;

public class TesteBanco {
    public static void main(String[] args) {
        Banco b1 = new Banco();
        Conta contaCorrente = new ContaCorrente(2222, "Irineu");
        Conta cC = new ContaCorrente(1220, "Jefferson");

        b1.adicionar(contaCorrente);
        Conta contapega = b1.pega(0);

        System.out.println("Quantidade de contas no Banco: "+ b1.quantidadeTotalContas());
        b1.buscarTitular("");
        Conta contaPega2 = b1.buscarTitular("Irineu");

    }
}
