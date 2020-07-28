package br.com.rd.rdevs.modelo;

public class StringJava {

    // EXERCICIO 1
    public void verificandoString(String meuTexto, String procurarPor) {
        //String meuTexto = "Hoje é sexta-feira. Uma da madruga!";
        //String procurarPor = "madruga";
        if (meuTexto.toLowerCase().contains(procurarPor.toLowerCase()) == true) {
            System.out.println("A Palavra: " + procurarPor + " existe no texto!");
        } else {
            System.out.println("Palavra nao encontrada!");
        }
    }

    public void mudarEspacoBranco(String meuTexto, String valorMudar) {
        //String meuTexto = "Hoje é sexta-feira. Uma da madruga!";
        //String procurarPor = "madruga";
        // meuTexto.replace("","");
        System.out.println("Resultado: " + meuTexto.replace("", valorMudar));

    }

    public void checarVazia(String stringRecebida) {
        if (stringRecebida.isEmpty()) {
            System.out.println("Vazia!");
        } else {
            System.out.println("Tem algo dentro...");
        }
    }

    public void contarCaractere(String stringRecebida) {
        System.out.println("Tamanho: " + stringRecebida.length());
    }


    // EXERCICIO 2 (OPCIONAL)
    public boolean pularCaractere(String fraseRecebida) {
        for (int i = 0; i <= fraseRecebida.length() - 1; i++) {
            System.out.println(fraseRecebida.charAt(i));
        }
        return true;
    }

    // EXERCICIO 3 (OPCIONAL)
    public String imprimaString(String fraseRecebida) {
        String resultado = "";
        for (int i = (fraseRecebida.length() - 1); i >= 0; i--) {
            resultado += fraseRecebida.charAt(i);
        }
        return resultado;
    }


    // EXERCICIO 4
    public void converte(String recebida){
        int num = 0;
        int total = 0;
        int valor = 0;

        for (int i = recebida.length() -1 ; i >= 0; i--) {

            num = Character.getNumericValue(recebida.charAt(i));
            int converteNumero = recebida.length() - i;

            while ( converteNumero > 1 ) {
                num = num * 10;
                converteNumero --;

            }
            total = num + total;
        }
        System.out.println("Total: " + total);
    }
}
