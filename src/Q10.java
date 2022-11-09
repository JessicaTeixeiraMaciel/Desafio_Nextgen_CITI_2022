//Desafio 01: Criar função que retorna uma playlist aleatória, alternando as músicas menos escutadas com as mais escutadas.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q10 {

    public static void main(String[] args) {
        System.out.println(shuffleMusicas(Arrays.asList(2,10,5,3)));
    }

    public static List<Integer> shuffleMusicas(List<Integer> musicasTocadas) {

        List<Integer> musicasEmOrdem = new ArrayList<>(musicasTocadas), musicasAlternadas = new ArrayList<>();
        musicasEmOrdem.sort(Collections.reverseOrder());

        for (int i = 0; i < musicasTocadas.size(); i++)
        {
            musicasAlternadas.add(musicasEmOrdem.get(0));
            musicasEmOrdem.remove(0);

            if (i % 2 == 0)
                Collections.sort(musicasEmOrdem);
            else
                musicasEmOrdem.sort(Collections.reverseOrder());
        }
        return musicasAlternadas;
    }
}