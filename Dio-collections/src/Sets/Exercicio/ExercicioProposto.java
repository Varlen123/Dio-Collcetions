package Sets.Exercicio;

import java.util.*;

public class ExercicioProposto {
    public static void main(String[] args) {
        ExercicioProposto exercicioProposto = new ExercicioProposto();

        Set<LinguagemFavorita> linguagensFavoritas = new HashSet<>();
        linguagensFavoritas.add(exercicioProposto.new LinguagemFavorita("Java", 1995, "Eclipse"));
        linguagensFavoritas.add(exercicioProposto.new LinguagemFavorita("Python", 1991, "PyCharm"));
        linguagensFavoritas.add(exercicioProposto.new LinguagemFavorita("Java", 1995, "Eclipse"));
        System.out.println(linguagensFavoritas);

        System.out.println("--\tOrdem de Inserção\t---");
        Set<LinguagemFavorita> linguagensFavoritas2 = new LinkedHashSet<>(Arrays.asList(
                exercicioProposto.new LinguagemFavorita("Java", 1995, "Eclipse"),
                exercicioProposto.new LinguagemFavorita("Python", 1991, "PyCharm"),
                exercicioProposto.new LinguagemFavorita("Java", 1995, "Eclipse")
        ));
        for (LinguagemFavorita linguagemFavorita : linguagensFavoritas2) {
            System.out.println(linguagemFavorita);
        }

        System.out.println("---\tOrdem natural (nome)\t---");
        Set<LinguagemFavorita> linguagensFavoritas3 = new TreeSet<>(linguagensFavoritas2);
        for (LinguagemFavorita linguagem : linguagensFavoritas3) {
            System.out.println(linguagem);
        }

        System.out.println("---\tOrdem IDE\t---");
        Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<>(new ComparatorIde());
        minhasLinguagensFavoritas3.addAll(linguagensFavoritas2);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas3) {
            System.out.println(linguagem);
        }
    }

    class LinguagemFavorita implements Comparable<LinguagemFavorita> {
        private String nome;
        private int anoCriacao;
        private String ide;

        public LinguagemFavorita(String nome, int anoCriacao, String ide) {
            this.nome = nome;
            this.anoCriacao = anoCriacao;
            this.ide = ide;
        }

        public String getNome() {
            return nome;
        }

        public int getAnoCriacao() {
            return anoCriacao;
        }

        public String getide() {
            return ide;
        }

        @Override
        public String toString() {
            return "{" +
                    "nome='" + nome + '\'' +
                    ", anoDeCriacao=" + anoCriacao +
                    ", ide='" + ide + '\'' +
                    '}';
        }

        @Override
        public int compareTo(LinguagemFavorita linguagemFavorita) {
            return this.nome.compareTo(linguagemFavorita.nome);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            LinguagemFavorita that = (LinguagemFavorita) o;
            return nome.equals(that.nome);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome);
        }
    }
}

// Comparadores separados da classe principal
class ComparatorIde implements Comparator<ExercicioProposto.LinguagemFavorita> {
    @Override
    public int compare(ExercicioProposto.LinguagemFavorita l1, ExercicioProposto.LinguagemFavorita l2) {
        return l1.getide().compareToIgnoreCase(l2.getide());
    }
}

class ComparatorAnoDeCriacaoENome implements Comparator<ExercicioProposto.LinguagemFavorita> {
    @Override
    public int compare(ExercicioProposto.LinguagemFavorita lf1, ExercicioProposto.LinguagemFavorita lf2) {
        int anoCriacao = Integer.compare(lf1.getAnoCriacao(), lf2.getAnoCriacao());
        if (anoCriacao != 0) return anoCriacao;
        return lf1.getNome().compareToIgnoreCase(lf2.getNome());
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<ExercicioProposto.LinguagemFavorita> {
    @Override
    public int compare(ExercicioProposto.LinguagemFavorita lf1, ExercicioProposto.LinguagemFavorita lf2) {
        int nome = lf1.getNome().compareToIgnoreCase(lf2.getNome());
        int anoCriacao = Integer.compare(lf1.getAnoCriacao(), lf2.getAnoCriacao());
        if (nome != 0) return nome;
        if (anoCriacao != 0) return anoCriacao;
        return lf1.getide().compareToIgnoreCase(lf2.getide());
    }
}
