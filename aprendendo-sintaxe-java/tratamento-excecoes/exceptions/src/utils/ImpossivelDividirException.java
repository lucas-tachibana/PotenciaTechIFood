package utils;

public class ImpossivelDividirException extends Exception {
    private int numerador;
    private int denominador;

    public ImpossivelDividirException(int numerador, int denominador) {
        super("Não é possível dividir " + numerador + " por " + denominador);
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "{" +
                " numerador='" + numerador + "'" +
                ", denominador='" + denominador + "'" +
                "}";
    }

}
