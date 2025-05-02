package Map.Exercicio;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExercicioProposto1 {
    public static void main(String[] args) {
        System.out.println("Crie um dicionario e relacione os modelos e seus respectivos valores");

        Map<String, Integer> estados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351545);
            put("CE", 9187118);
            put("RN", 3514261);
        }};

        System.out.println(estados);

        System.out.println("Substitua o valor do RN por 3.514.261");
        estados.put("RN", 3514165);
        System.out.println(estados);

        System.out.println("Confira se o estado da PB está contido no dicionário: " + estados.containsKey("PB"));

        System.out.println("Exiba o valor do PE");
        System.out.println(estados.get("PE"));

        System.out.println("Exiba os estados em ordem alfabética");
        Map<String, Integer> estados2 = new TreeMap<>(estados);
        System.out.println(estados2);


        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> populaçãoEstadosNE2 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(populaçãoEstadosNE2);

        System.out.println("Exiba o estado com a menor população e maior população" + Collections.min(estados.values()));
         Collection<Integer> populacao = estados.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : estados.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
                estadoMenorPopulacao, Collections.min(populacao));
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
                estadoMaiorPopulacao, Collections.max(populacao));

        System.out.println("Exiba a soma da população dos estados");
        Iterator<Integer> iterator = estados.values().iterator();
        Double soma = 0.0;

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            soma += next;
            System.out.println("A soma das população dos estados é" + soma);
            
        }

        System.out.println("Exiba a media da população dos estados");
        System.out.println(soma / estados.size());
        
        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = estados.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) iterator1.remove();
        }

        System.out.println("estados");

        System.out.println("Apague o dicionário de estados");
        estados.clear();
        System.out.println(estados);

        System.out.println("Confira se o dicionário de estados esta vazio: " + estados.isEmpty());
    } 
}
