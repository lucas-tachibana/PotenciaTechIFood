import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExerciciosStreamApi {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima os elementos dessa lista");
        numerosAleatorios.stream().forEach(System.out::println);

        System.out.println("Coloque os 5 primeiros números dentro de um Set");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Transforme a lista em números inteiros");
        List<Integer> listaInt = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());

        listaInt.stream().forEach(System.out::println);

        System.out.println("Pegue os números pares maiores que 2 e coloque em uma lista");

        List<Integer> listaParesMaioresQueDois = numerosAleatorios.stream().map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList());

        listaParesMaioresQueDois.stream().forEach(System.out::println);

        System.out.println("Mostre a soma e a média dos números");

        Integer soma = numerosAleatorios.stream().mapToInt(Integer::parseInt).sum();
        System.out.println("Soma = " + soma);
        OptionalDouble media = numerosAleatorios.stream().mapToInt(Integer::parseInt).average();
        System.out.println(media);
        ;

    }
}
