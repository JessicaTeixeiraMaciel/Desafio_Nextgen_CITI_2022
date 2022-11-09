//Desafio 05: Criar função que retorna as chances de cada participante de um torneio, conforme numero de horas assistidas. Os assinates devem ter o dobro de chances.

import java.util.*;

public class Desafio05_calculaPorcentagemSorteio {

    public static void main(String[] args) {
        System.out.println(calculaPorcentagemSorteio(Arrays.asList(true,false),Arrays.asList(60,60)));
    }

    public static List<Integer> calculaPorcentagemSorteio(List<Boolean> assinante,List<Integer> minutosAssistidos) {

        ArrayList<Object> horasAssistidas = new ArrayList<>();
        int totalDeHorasAssistidas = 0;

        for(int i = 0; i < minutosAssistidos.size(); i++){
            double converteMinutosEmHoras = Math.ceil(minutosAssistidos.get(i) / 60.0);

            if (assinante.get(i)){
                horasAssistidas.add((int)converteMinutosEmHoras * 2);
            }else {
                horasAssistidas.add((int)converteMinutosEmHoras);
            }
            totalDeHorasAssistidas += (int)horasAssistidas.get(i);
        }

        ArrayList<Integer> chances = new ArrayList<>();
        double chanceDeCadaParticipante;

        for (Object horasAssistida : horasAssistidas) {
            chanceDeCadaParticipante = (100.0 * (int) horasAssistida / totalDeHorasAssistidas);
            chances.add(Math.toIntExact(Math.round(chanceDeCadaParticipante)));
        }
        return  chances;
    }
}
