//Desafio 01: Criar função que retorna o posto de combustível mais distante, dentro do limite de combustivel. Caso não haja opções retornar -1.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Desafio01_ultimaParada {
    public static void main(String[] args) {

        System.out.println(ultimaParada(2,8,Arrays.asList(2,15,22,1)));
    }
    public static Integer ultimaParada(Integer combustivel,Integer consumo,List<Integer> postosDeGasolina) {

        Integer ultimaParada = -1;

        Collections.sort(postosDeGasolina);

        Integer distanciaMaxima = combustivel * consumo;

        for (Integer postoMaisDistantePossivel : postosDeGasolina){
            if (postoMaisDistantePossivel <= distanciaMaxima)
                ultimaParada = postoMaisDistantePossivel;
        }

        return ultimaParada;
    }
}