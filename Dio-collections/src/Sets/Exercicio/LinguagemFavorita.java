package Sets.Exercicio;

import java.util.HashSet;
import java.util.Set;

public class LinguagemFavorita {
    public static void main(String[] args) {
     Set<String> linguagens = new HashSet<>();
     Linguagens java = new Linguagens("Java", 1995, "Eclipse");
     Linguagens kotlin = new Linguagens("Kotlin", 2011, "Intellij");
     linguagens.add(java.getIde());
     linguagens.add(kotlin.getIde());
     System.out.println(linguagens);

     System.out.println("mostre em ordem de inserção");
     for(String linguagem : linguagens){
         System.out.println(linguagem);
     }
    }
public class Linguagens{
    private String nome;
    private int anoCriacao;
    private String ide;

    public Linguagens(String nome, int anoCriacao, String ide) {
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

    public String getIde() {
        return ide;
    }
    
    }
}
