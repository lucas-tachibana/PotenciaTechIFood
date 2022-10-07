import java.sql.Date;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("OOOOOOOOOi :)");
        String nome = "Lucas";
        int anoNascimento = 1989;
        int anoAtual = 1995;
        boolean maiorIdade;
        String maiorOuMenor;

        maiorIdade = verificaIdade(anoNascimento, anoAtual);
        if (maiorIdade) {
            maiorOuMenor = "maior de idade.";
        } else {
            maiorOuMenor = "menor de idade.";
        }
        System.out
                .println(nome + " nasceu em " + anoNascimento + ", portanto em " + anoAtual + " ele é " + maiorOuMenor);

    }

    private static boolean verificaIdade(int anoNascimento, int anoAtual) {
        if (anoAtual - anoNascimento > 18)
            return true;
        return false;
    }
}
