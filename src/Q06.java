//Desafio 06: Criar função que retorna se um número está oculto dentro de outro.

import java.util.*;

public class Q06 {

    public static void main(String[] args) {
        System.out.println(checaNumeroEscondido(12345, 235));
    }

    public static boolean checaNumeroEscondido(Integer numero, Integer numeroOculto) {

        String[] numerosEmLista = numero.toString().split("");
        String[] numerosOcultosEmLista = numeroOculto.toString().split("");
        List<String> numerosOcultosEncontrados = new ArrayList<>();

        int posicaoNumero = 0;
        int posicaoNumeroOculto = 0;

        while (posicaoNumero < numerosEmLista.length && posicaoNumeroOculto < numerosOcultosEmLista.length){
            if (numerosEmLista[posicaoNumero].equals(numerosOcultosEmLista[posicaoNumeroOculto])){
                numerosOcultosEncontrados.add(numerosOcultosEmLista[posicaoNumeroOculto]);
                posicaoNumeroOculto++;
            }
            posicaoNumero++;
        }
        return Arrays.toString(numerosOcultosEmLista).equals(numerosOcultosEncontrados.toString());
    }
}
