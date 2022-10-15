import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("--\tOrdem Aleatória\t--");
        Set<Serie> minhaSeries = new HashSet<>() {
            {
                add(new Serie("got", "fantasia", 60));
                add(new Serie("dark", "drama", 60));
                add(new Serie("that 70's show", "comédia", 25));
            }
        };

        for (Serie serie : minhaSeries) {
            System.out.println(serie);
        }

        System.out.println("--\tOrdem de Inserção\t--");
        Set<Serie> minhaSeries1 = new LinkedHashSet<>() {
            {
                add(new Serie("got", "fantasia", 60));
                add(new Serie("dark", "drama", 60));
                add(new Serie("that 70's show", "comédia", 25));
            }
        };

        for (Serie serie : minhaSeries1) {
            System.out.println(serie);
        }

        System.out.println("--\tOrdem Natural (TempoEpisodio)\t--");
        Set<Serie> minhaSeries2 = new TreeSet<>(minhaSeries1);
        System.out.println(minhaSeries2);

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio \t--");
        Set<Serie> minhaSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhaSeries3.addAll(minhaSeries);

        System.out.println(minhaSeries3);
    }
}

class Serie implements Comparable {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return this.tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    public Serie() {
    }

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", genero='" + getGenero() + "'" +
                ", tempoEpisodio='" + getTempoEpisodio() + "'" +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Serie)) {
            return false;
        }
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero)
                && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Object o) {

        if (!(o instanceof Serie)) {
            return 0;
        }
        Serie serie = (Serie) o;
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0)
            return tempoEpisodio;

        return this.getGenero().compareTo(serie.getGenero());
    }

}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie o1, Serie o2) {
        Serie serie1 = (Serie) o1;
        Serie serie2 = (Serie) o2;
        int nome = serie1.getNome().compareTo(serie2.getNome());
        if (nome != 0)
            return nome;
        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if (genero != 0)
            return genero;
        return Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());

    }

}