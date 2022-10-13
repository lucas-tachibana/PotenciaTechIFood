import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ConhecendoMetodosList {
    public static void main(String[] args) throws Exception {
        // Crie uma lista e adicione sete notas
        List<Double> notas = new ArrayList<Double>();
        notas.add(5d);
        notas.add(5.7d);
        notas.add(8d);
        notas.add(7.5d);
        notas.add(4d);
        notas.add(6.5d);
        notas.add(8.5d);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: ");
        System.out.println(notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas.toString());

        System.out.println("Substitua a nota 5.0 pela nota 9.0:");
        notas.set(notas.indexOf(5d), 9.0);
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 está na lista: ");
        System.out.println(notas.contains(5d));

        System.out.println("Exiba as notas na ordem de inserção:");
        for (Double nota : notas) {
            System.out.println(nota);
        }

        System.out.println("Exiba a terceira nota adicionada");
        System.out.println(notas.get(2));
        System.out.println(notas);

        System.out.println("Exiba a menor nota: ");
        System.out.println(Collections.min(notas));

        System.out.println("Exiba a maior nota:");
        System.out.println(Collections.max(notas));

        System.out.println("Exiba a soma das notas");
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas: ");
        System.out.println(soma / (notas.size()));

        System.out.println("Remova a nota 6.5");
        notas.remove(6.5);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7.0");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            double next = iterator1.next();
            if (next < 7)
                iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia");
        System.out.println(notas.isEmpty());

        System.out.println("Apague os itens da lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia");
        System.out.println(notas.isEmpty());
    }
}
