import java.util.*;

public class OrdemacaoDeElementosList {
    /*
     * Dadas as seguintes informações sobre meus gatos, crie uma lista e ordene-a
     * exibindo:
     * (nome - idade - cor);
     * 
     * Gato 1 = nome: Jon, idade: 18, cor: preto
     * Gato 2 = nome: Simba, idade: 6, cor: tigrado
     * Gato 3 = nome: Jon, idade: 12, cor: amarelo
     */
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>() {
            {
                add(new Gato("Jon", 18, "Preto"));
                add(new Gato("Simba", 6, "Tigrado"));
                add(new Gato("Jon", 12, "Amarelo"));
            }
        };

        System.out.println("--\tOrdem de Inserção\t--");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Aleatória\t--");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural (Nome)\t--");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem de Idade\t--");
        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem de Cor\t--");
        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t--");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public Gato() {
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getCor() {
        return this.cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", idade='" + getIdade() + "'" +
                ", cor='" + getCor() + "'" +
                "}";
    }

    @Override
    public int compareTo(Gato gato) {
        // TODO Auto-generated method stub
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        // TODO Auto-generated method stub
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }

}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        // TODO Auto-generated method stub
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }

}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        // TODO Auto-generated method stub
        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if (nome != 0)
            return nome;

        int cor = gato1.getCor().compareToIgnoreCase(gato2.getNome());
        if (cor != 0)
            return cor;

        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }

}