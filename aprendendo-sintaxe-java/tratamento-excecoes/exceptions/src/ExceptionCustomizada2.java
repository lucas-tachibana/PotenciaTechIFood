import javax.swing.JOptionPane;

import utils.DivisaoNaoExataException;
import utils.ImpossivelDividirException;

public class ExceptionCustomizada2 {
    public static void main(String[] args) {
        int[] numerador = { 4, 5, 8, 10 };
        int[] denominador = { 2, 4, 0, 2, 8 };

        for (int i = 0; i < denominador.length; i++) {

            try {
                if (numerador[i] % 2 != 0)
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);

                else if (denominador[i] == 0)
                    throw new ImpossivelDividirException(numerador[i], denominador[i]);

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                e.printStackTrace();
            } catch (ImpossivelDividirException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                e.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                e.printStackTrace();
            }

        }
        System.out.println("Continuação...");

    }
}
