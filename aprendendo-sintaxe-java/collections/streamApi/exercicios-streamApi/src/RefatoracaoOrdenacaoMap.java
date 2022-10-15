import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class RefatoracaoOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("--\tOrdem Aleatoria\t--");
        Map<Integer, Contato> agenda = new HashMap<>() {
            {
                put(1, new Contato("Simba", 5555));
                put(4, new Contato("Cami", 1111));
                put(3, new Contato("Jon", 2222));
            }
        };

        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem de Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {
            {
                put(1, new Contato("Simba", 5555));
                put(4, new Contato("Cami", 1111));
                put(3, new Contato("Jon", 2222));
            }
        };
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem de Id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato> entry : agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem de Telefone\t--");

        // Utilizando Função Lambda
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(
                Comparator.comparing(cont -> cont.getValue().getNumero()));

        // Utilizando Classe Anônima
        // Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(
        // Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {

        // @Override
        // public Integer apply(Map.Entry<Integer, Contato> cont) {
        // // TODO Auto-generated method stub
        // return cont.getValue().getNumero();
        // }

        // }));
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set) {
            System.out.println(
                    entry.getKey() + " - " + entry.getValue().getNumero() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem Nome\t--");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {

            @Override
            public int compare(Entry<Integer, Contato> o1, Entry<Integer, Contato> o2) {
                // TODO Auto-generated method stub
                return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
            }

        });
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }

}
