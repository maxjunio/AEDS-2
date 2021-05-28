
import java.util.Random;

public class exerc03 {

    public static String alteraAleatorio(String palavra) {
        String alterada = "";
        char aleatorio1;
        char aleatorio2;
        Random gerador = new Random();
        gerador.setSeed(4);
        aleatorio1 = (char)('a' + Math.abs(gerador.nextInt() % 26));
        aleatorio2 = (char) ('a' + Math.abs(gerador.nextInt() % 26));
         MyIO.println("a1 " + aleatorio1);
          MyIO.println("a2 " + aleatorio2);
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == (aleatorio1)) {
                alterada += aleatorio2;

            } else {
                alterada += palavra.charAt(i);
            }

        }

        return alterada;
    }

    public static void main(String[] args) {
        MyIO entrada = new MyIO();
        String resultado;

        while (!entrada.equals("FIM")) {
            String text = entrada.readLine();
            if (text.equals("FIM")) {
                break;
            } else {
                resultado = alteraAleatorio(text);
                MyIO.println(resultado);

            }

        }

    }

}
