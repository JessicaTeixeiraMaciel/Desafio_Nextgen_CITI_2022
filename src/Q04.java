//Desafio 04: Criar função que retorna os termos mais repetidos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q04 {
    public static void main(String[] args) {
        System.out.println(calculaTopOcorrenciasDeQueries("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",Arrays.asList("a","em","i","el"),2));
    }
    public static List<String> calculaTopOcorrenciasDeQueries(String texto,List<String> queries,Integer k) {

        Map<String,Integer> list = new Hashtable<>();

        List<String> resultado = new ArrayList<>();

        for (String q: queries)
        {
            Pattern pattern = Pattern.compile(q);
            Matcher matcher = pattern.matcher(texto);
            int contarCaracteres = 0;
            while(matcher.find())
                contarCaracteres++;

            list.put(q,contarCaracteres);
        }

        LinkedHashMap<String, Integer> listaOrganizada = new LinkedHashMap<>();

        list.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> listaOrganizada.put(x.getKey(), x.getValue()));

        for (int q = 0; q < listaOrganizada.size()-(listaOrganizada.size() - k); q++)
        {
            String query = (String)listaOrganizada.keySet().toArray()[q];
            resultado.add(query);
        }

        return resultado;
    }
}