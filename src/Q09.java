//Desafio 09: Criar função que reordena um nome e retorna um novo nome maior que o anterior, conforme ordem alfabética. O novo nome deverá ser o menor próximo possível.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q09 {

    public static void main(String[] args) {
        System.out.println(menorStringMaior("abcde"));
    }
    public static String menorStringMaior(String name) {

        String nameTratado = name.replace(" ","");

        List<String> letras = List.of(nameTratado.split(""));
        List<String>letrasInvertidas = new ArrayList<>(letras);
        int numeroDeLetras = letras.size();

        if (nameTratado.length() < 2) {
            return "sem resposta";
        }else{

            int i = numeroDeLetras-1;
            int j = numeroDeLetras-2;

            Collections.swap(letrasInvertidas,i, j);

            String resultado = letrasInvertidas.toString().replaceAll("[^0-9A-Za-z]", "");

            int teste = resultado.compareTo(nameTratado);

            if (teste > 0){
                return letrasInvertidas.toString().replaceAll("[^0-9A-Za-z]", "");
            } else if (numeroDeLetras > 2) {
                if (letrasInvertidas.get(i).compareTo(letrasInvertidas.get(j)) <= 0) {
                    while (letrasInvertidas.get(i).compareTo(letrasInvertidas.get(j)) <= 0) {
                        i--;
                        j--;
                    }
                    Collections.swap(letrasInvertidas, i, j);
                    return letrasInvertidas.toString().replaceAll("[^0-9A-Za-z]", "");

                } else if (letrasInvertidas.get(i).compareTo(letrasInvertidas.get(j)) > 0) {
                    while (letrasInvertidas.get(i).compareTo(letrasInvertidas.get(j)) > 0) {
                        i--;
                        j--;
                    }

                    Collections.swap(letrasInvertidas, i - 1, j - 1);
                    int n = 0;
                    while (i < numeroDeLetras - 1) {
                        i += n;
                        j += n;
                        Collections.swap(letrasInvertidas, i, j);
                        n++;
                    }
                    return letrasInvertidas.toString().replaceAll("[^0-9A-Za-z]", "");
                } else {
                    return "sem resposta";
                }
            }else {
                return "sem resposta";
            }
        }

    }
}