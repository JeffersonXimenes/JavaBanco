package br.com.rd.rdevs.main;

import java.util.ArrayList;
import java.util.Collection;

public class JavaCollection {
    public static void main(String[] args) {

        System.out.println("Iniciando...");
        Collection<Integer> teste = new ArrayList<>();
        long inicio = System.currentTimeMillis();
        int total = 30000;
        for (int i = 0; i < total; i++) {
            teste.add(i);
        }
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);

        /*Exercício 1
            HashSet demora cerga de 10 milisegundos..
            ArrayList, demora cerca de 396 milisegundos. Pq? tirando um dos for da linha 17, pude perceber que ele tem dificuldade
            para pesquisar. Então após tirar ele, passa a fazer as pesquisas bem mais rápidas. Já o HashSet
            não tem tanta dificuldade assim para o processamento.
        */

        /*Exercício 2
            Daria para utilizar o set. Caso, a gente queira utilizar operações especificas, remover e esvaziar daria para se referir a outras classes sem ser collection.
        */

        /*Exercício 3
            Para adicionar o Generic, utilizei:
            Add type arguments to ‘Map’
        */

        /*Exercício 4
            LinkedLsit teve um desempenho melhor em comparação ao ArrayList. Porém, dependendo dos casos o ArrayList se sairia melhor, ou seja, caso a gente fosse percorrer somente o ArrayList se sairia melhor.
        */

        /*Exercício 5
            * IMPLEMENTADO > Encontra-se model.Banco
        */

        /*Exercício 6
            * IMPLEMENTADO > Encontra-se model.Banco
        */
    }
}
