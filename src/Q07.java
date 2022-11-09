//Desafio 07: Criar função que retorna o número de leds de um painel, sendo que os paineis sao formados por quadrados de 1x1 cm e há um led em cada extremidade do quadrado.

public class Q07 {

    public static void main(String[] args) {
        System.out.println(calculaTotalLeds(2,3));
    }
    public static Integer calculaTotalLeds(Integer altura,Integer largura) {
        if (altura <= 0 || largura <= 0){
            return 0;
        } else {
            int ledsEmLinhas = altura + 1;
            int ledsEmColunas = largura + 1;
            return ledsEmLinhas * ledsEmColunas;
        }
    }
}