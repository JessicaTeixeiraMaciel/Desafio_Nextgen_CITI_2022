//Desafio 03: Criar decifrador de senha que retorna a senha decodificada;

import java.util.Arrays;
import java.util.List;

public class Q03 {
    public static void main(String[] args) {
        System.out.println(calculaNumeroDaSenha(Arrays.asList("0110100000","1001011111","1110001010","0111010101","0011100110","1010011001","1101100100","1011010100","1001100111","1000011000")));

    }
    public static Integer calculaNumeroDaSenha(List<String> senha) {

        StringBuilder senhaUnica = new StringBuilder();

        for (int coluna = 0; coluna<senha.get(0).length();coluna++)
        {
            int calc = 0;
            for (String s : senha)
                calc += Integer.parseInt(String.valueOf(s.charAt(coluna)));

            if(calc >= senha.size() / 2)
                senhaUnica.append("1");
            else
                senhaUnica.append("0");
        }

        return Integer.parseInt(senhaUnica.toString(), 2);
    }
}