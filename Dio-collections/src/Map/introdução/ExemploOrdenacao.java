package Map.introdução;

import java.util.*;

public class ExemploOrdenacao {
    public static void main(String[] args) {

        System.out.println("Exiba em ordem aleatória");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put(" Hawking, Stphen", new Livro("Uma breve história do tempo", 256));
            put(" Duhigg, Charles", new Livro("O poder do habito", 408));
            put(" Harari, Yuval Noah", new Livro("21 licões para o seculo 21", 432));
        }};
        System.out.println(meusLivros);

        for (Map.Entry<String, Livro> entry : meusLivros.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t---");
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>(){{
            put(" Hawking, Stphen", new Livro("Uma breve história do tempo", 256));
            put(" Duhigg, Charles", new Livro("O poder do habito", 408));
            put(" Harari, Yuval Noah", new Livro("21 licões para o seculo 21", 432));
        }};
        System.out.println(meusLivros2);

        System.out.println("Em ordem alfabética dos autores");
        Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros2);
        System.out.println(meusLivros3);

        System.out.println("Exiba apenas os nomes dos livros");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new CompararNome());
        meusLivros4.addAll(meusLivros.entrySet());
        System.out.println(meusLivros4);
    }
}

class Livro {
    private String nome;
    private int paginas;

    public Livro(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class CompararNome implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> e1, Map.Entry<String, Livro> e2) {
        return e1.getValue().getNome().compareToIgnoreCase(e2.getValue().getNome());
    }
}