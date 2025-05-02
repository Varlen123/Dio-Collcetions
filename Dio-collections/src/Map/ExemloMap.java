package Map;
import java.util.*;
import java.util.Map.Entry;
public class ExemloMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionario e relacione os modelos e seus respectivos valores");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 1.6);
            put("uno", 1.0);
            put("mobi", 1.2);
            
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o valor do gol por 15.2");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionario: " + carrosPopulares.containsKey("tucson"));
        
        System.out.println("Exiba o valor do uno" + carrosPopulares.get("uno"));

        System.out.println("Exiba os modelos");
        Set<String> keySet = carrosPopulares.keySet();
        System.out.println(keySet);

        System.out.println("Exiba os valores");
        Collection<Double> values = carrosPopulares.values();
        System.out.println(values);

        System.out.println("Exiba os modelos e seus respectivos valores em ordem alfabética");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares);
        System.out.println(carrosPopulares2);

        System.out.println("Exiba o modelo mais econômico: " + Collections.max(carrosPopulares2.values())); 
        Set<Entry<String, Double>> entries = carrosPopulares2.entrySet();
        String modeloMaisEficiente = " ";
        for(Map.Entry<String, Double> entry: entries){
          if(entry.getValue().equals(modeloMaisEficiente))
          modeloMaisEficiente = entry.getKey();
        }
        System.out.println("O modelo mais eficiente: " + modeloMaisEficiente);

        System.out.println("Exiba o menos econômico");
        Double consumoMenosEficiente = Collections.min(carrosPopulares2.values());
        for ( Map.Entry<String, Double> entry : carrosPopulares2.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                System.out.println("O modelo menos eficiente: " + entry.getKey());
            }
            
        }

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0.0;

        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma dos consumos: " + soma);

        System.out.println("A media dos consumos: " + (soma / carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 1.6");
    
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();

        while(iterator1.hasNext()){
           if(iterator1.next().equals(1.6)) iterator1.remove();
        
        }

        System.out.println("Organize em ordem alfabetica");
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares);
        System.out.println(carrosPopulares3);

        System.out.println("Apague o dicionario de carros");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);
    }
}
