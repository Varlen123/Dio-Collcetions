package Lists;

import java.util.ArrayList;
import java.util.List;

public class ExemploDeOrdenacao {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Varlete", 2, "preto"));
        }};
    }
}

class Gato{
    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getCor() {
        return cor;
    }
}