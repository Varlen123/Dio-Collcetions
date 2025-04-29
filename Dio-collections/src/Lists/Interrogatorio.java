package Lists;
import java.util.ArrayList;
import java.util.List;

public class Interrogatorio {
    public static void main(String[] args) {
        List <Pergunta> perguntas = new ArrayList<>(){{
            add(new Pergunta("Telefonou para a vitima?", "sim"));
            add(new Pergunta("Esteve no local do crime?", "sim"));
            add(new Pergunta("Mora perto da vitima?", "sim"));
            add(new Pergunta("Devia para a vitima?", "sim"));
            add(new Pergunta("Ja trabalhou com a vitima?", "sim"));
        }};
    }

     class Pergunta {
        private String pergunta;
        private String resposta;
        
        public Pergunta(String pergunta, String resposta) {
            this.pergunta = pergunta;
            this.resposta = resposta;
        }

        public String getPergunta() {
            return pergunta;
        }

        public String getResposta() {
            return resposta;
        }
    }

    
}
