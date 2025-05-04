import java.util.*;
import java.util.stream.Collectors;

public class Exercicio {
    public static void main(String[] args) {
        List<Usuario> usuarios = Arrays.asList(
            new Usuario("Ana", 17, List.of(new Livro("Harry Potter"))),
            new Usuario("Carlos", 22, List.of(new Livro("Senhor dos Anéis"), new Livro("Java para Iniciantes"))),
            new Usuario("Bianca", 19, List.of()),
            new Usuario("Pedro", 30, List.of(new Livro("Clean Code")))
        );
        
        List<String> nomesMaiores = usuarios.stream()
        .filter(u -> u.getIdade() > 20)
        .map(u -> u.getNome().toUpperCase())
        .collect(Collectors.toList());

        System.out.println(nomesMaiores);

        long totalLivros = usuarios.stream()
            .filter(u -> u.getIdade() >= 18)
            .flatMap(u -> u.getLivrosEmprestados().stream())
            .count();

        System.out.println("Total de livros emprestados por maiores: " + totalLivros);

    
        Map<Integer, List<Usuario>> agrupadosPorIdade = usuarios.stream()
            .collect(Collectors.groupingBy(Usuario::getIdade));

        System.out.println("\nUsuários agrupados por idade:");
        agrupadosPorIdade.forEach((idade, lista) -> {
            System.out.println("Idade " + idade + ": " + 
                lista.stream().map(Usuario::getNome).collect(Collectors.joining(", ")));
        });
        
    }

    public static class Livro {
        String titulo;
    
        Livro(String titulo) {
            this.titulo = titulo;
        }
    
        public String getTitulo() {
            return titulo;
        }
        
        @Override
        public String toString() {
            return "Livro{" +
                    "titulo='" + titulo + '\'' +
                    '}';
        }
    }
    
    public static class Usuario {
        String nome;
        int idade;
        List<Livro> livrosEmprestados;
    
        Usuario(String nome, int idade, List<Livro> livrosEmprestados) {
            this.nome = nome;
            this.idade = idade;
            this.livrosEmprestados = livrosEmprestados;
        }
    
        public String getNome() {
            return nome;
        }
    
        public int getIdade() {
            return idade;
        }
    
        public List<Livro> getLivrosEmprestados() {
            return livrosEmprestados;
        }
        
        @Override
        public String toString() {
            return "Usuario{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", livrosEmprestados=" + livrosEmprestados +
                    '}';
        }
    }
}