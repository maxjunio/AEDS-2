
public class Combinador {
    //metodo combinador que recebe 2 strings, verifica a posição das letras e combina as strings
    public static String combinador(String palavra1, String palavra2) {
        String combinada = "";
        int i = 0;
        while (i < palavra1.length() || i < palavra2.length()) {//enquanto i for menor que a palavra1 ou que a palavra2
            if (i < palavra1.length() && i >= palavra2.length()) {// se i for menor que a palavra1 e for maior ou igual a palavra2
                combinada += (char) (palavra1.charAt(i));
            } else if (i >= palavra1.length() && i < palavra2.length()) {//se o inverso ocorrer
                combinada += (char) (palavra2.charAt(i));

            } else {
                combinada += (char) (palavra1.charAt(i));
                combinada += (char) (palavra2.charAt(i));
            }
            i++;
        }
        return combinada;
    }

    public static void main(String[] args) {
        String text1="", text2;
        String[] text3;
        //enquanto text1 nao receber FIM ele executará as instruções
        while (!text1.equals("FIM")) {
            text1 = MyIO.readLine();
            if (text1.equals("FIM")) {
                break;
            } else {//verfica se não existe espaço no termo digitado
                if (!text1.contains(" ")) {
                    //não executa nada
                } else {//caso tenha o espaõ, ele divide o texto nos espaçosm, em vetores 
                    text3 = text1.split(" ");
                    text2 = text3[1];//o texto 2 recebe a segunda parte do texto localizada no vetor 1
                    text1 = text3[0];// o texto 3 recebe a primeira parte do texto localizada no vetor 0
                    MyIO.println(combinador(text1, text2));// executa o método 

                }

            }

        }

    }

}
