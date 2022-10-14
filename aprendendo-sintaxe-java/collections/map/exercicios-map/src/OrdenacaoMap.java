import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("--\tOrdem Aleatória\t--");
        Map<String, Livro> meusLivros = new HashMap<>() {
            {
                put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
                put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
                put("Harari Yuval Noah", new Livro("21 Lições para o Século 21", 432));
            }
        };
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem de Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {
            {
                put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
                put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
                put("Harari Yuval Noah", new Livro("21 Lições para o Século 21", 432));
            }
        };
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem Alfabétida dos Autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>() {
            {
                put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
                put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
                put("Harari Yuval Noah", new Livro("21 Lições para o Século 21", 432));
            }
        };

        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem Alfabética dos nomes do livros\t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> entry : meusLivros3) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem de Quantidade de Páginas\t--");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNumeroPagina());

        meusLivros4.addAll(meusLivros.entrySet());

        for (Entry<String, Livro> entry : meusLivros4) {
            System.out.println(
                    entry.getValue().getPaginas() + " - " + entry.getKey() + " - " + entry.getValue().getNome());
        }

    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return this.paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public Livro() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Livro)) {
            return false;
        }
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", paginas='" + getPaginas() + "'" +
                "}";
    }

}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }

}

class ComparatorNumeroPagina implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        return o1.getValue().getPaginas().compareTo(o2.getValue().getPaginas());
    }

}