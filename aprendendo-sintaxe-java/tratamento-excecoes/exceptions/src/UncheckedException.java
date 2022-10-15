import javax.swing.JOptionPane;

public class UncheckedException {
    public static void main(String[] args) {
        boolean continueLooping = true;

        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                double resultado = dividir(Double.parseDouble(a), Double.parseDouble(b));
                System.out.println("Resultado :" + resultado);
                continueLooping = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida " + e.getMessage());
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Impossível dividir por 0");
            } finally {
                System.out.println("Passou por aqui");
            }

        } while (continueLooping);

        System.out.println("Continuando...");

    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}
