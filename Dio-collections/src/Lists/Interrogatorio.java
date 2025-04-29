package Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interrogatorio {
    public static class Pergunta {
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

    public static void main(String[] args) {
        List <Pergunta> perguntas = new ArrayList<Pergunta>(){{
            add(new Pergunta("Telefonou para a vitima?", "sim"));
            add(new Pergunta("Esteve no local do crime?", "sim"));
            add(new Pergunta("Mora perto da vitima?", "sim"));
            add(new Pergunta("Devia para a vitima?", "sim"));
            add(new Pergunta("Ja trabalhou com a vitima?", "sim"));
        }};

        Scanner scanner = new Scanner(System.in);
        int contSim = 0;

        for (Pergunta pergunta : perguntas) {
            System.out.println(pergunta.getPergunta());
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                contSim++;
            }
        }

        if (contSim >= 2 && contSim < 3) {
            System.out.println("Você é suspeito!");
        } else if (contSim >= 3 && contSim < 4) {
            System.out.println("Você é cúmplice!");
        } else if (contSim >= 4 && contSim < 5) {
            System.out.println("Você é assassino!");
        } else {
            System.out.println("Você não é suspeito.");
        }
    }
}