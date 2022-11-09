//Criar função que retorna qual a melhor empresa de taxi para escolher, conforme valores das taxas fixas, valor por km rodado e distância a ser percorrida.

public class Q08{

    public static void main(String[] args) {
        System.out.println(escolheTaxi("5.0","0.75","2.5","1.0"));
    }

    public static String escolheTaxi(String tf1,String vqr1,String tf2,String vqr2) {

        if (tf1.equals(tf2) && vqr1.equals(vqr2)){
            return "Tanto faz";

        } else if (Double.parseDouble(tf1) < Double.parseDouble(tf2) && (Double.parseDouble(vqr1) < Double.parseDouble(vqr2))){
            return "Empresa 1";

        } else if (Double.parseDouble(tf2) < Double.parseDouble(tf1) && (Double.parseDouble(vqr2) < Double.parseDouble(vqr1))){
            return "Empresa 2";

        } else {
            double kmTantoFaz = (Double.parseDouble(tf2) - Double.parseDouble(tf1)) / (Double.parseDouble(vqr1) - Double.parseDouble(vqr2));
            double kmArrendondado = Math.round(kmTantoFaz*100.0)/100.0;
            double kmTeste = kmTantoFaz + 1.0;
            double v1 = Double.parseDouble(tf1) + Double.parseDouble(vqr1) * kmTeste;
            double v2 =  Double.parseDouble(tf2) + Double.parseDouble(vqr2) * kmTeste;
            String EmpresaDistanciaMenor = null;
            String EmpresaDistanciaMaior = null;

            if (v1 > v2){
                EmpresaDistanciaMenor = "1";
                EmpresaDistanciaMaior = "2";
            } else {
                EmpresaDistanciaMenor = "2";
                EmpresaDistanciaMaior = "1";
            }
            return "Empresa " + EmpresaDistanciaMenor + " quando a distância < " + kmArrendondado + ", Tanto faz quando a distância = " + kmArrendondado + ", Empresa " + EmpresaDistanciaMaior + " quando a distância > " + kmArrendondado;
        }
    }
}