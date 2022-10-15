import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = { 64, 137, -16, 43, 67, 81, -90, 212, 10, 75 };

        // TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.
        int numero = leitor.nextInt();
        System.out.println(buscaNumero(numero, elementos));

    }

    public static String buscaNumero(int numero, int[] elementos) {
        for (int i = 0; i < elementos.length; i++) {
            if (numero == elementos[i]) {
                return "Achei " + numero + " na posicao " + i;
            }
            return "Numero " + numero + " nao encontrado!";
        }
        return "";
    }
}
