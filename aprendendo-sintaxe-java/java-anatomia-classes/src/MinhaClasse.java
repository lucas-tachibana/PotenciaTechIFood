import java.sql.Date;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Lucas";
        String segundoNome = "Tachibana";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    private static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
