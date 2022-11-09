//Desafio 02: Criar função que retorna o menor e maior valor em venda.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Q02 {
    public static void main(String[] args) {
        System.out.println(retornaMenorEMaiorValorDeVendas(Arrays.asList(Arrays.asList(200,100),Arrays.asList(300))));
    }
        public static List<Integer> retornaMenorEMaiorValorDeVendas(List<List<Integer>> tickets) {
            List<Integer> menorEMaiorValor = new ArrayList<>();

            for (List<Integer> vendedor : tickets) {

                for (int venda : vendedor)
                    if(venda >= 20 && venda <= 500)
                        menorEMaiorValor.add(venda);
            }

            Collections.sort(menorEMaiorValor);

            return Arrays.asList(menorEMaiorValor.get(0),menorEMaiorValor.get(menorEMaiorValor.size()-1));
        }
    }
