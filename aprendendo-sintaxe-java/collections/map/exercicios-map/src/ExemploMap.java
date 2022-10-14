import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos:");
        Map<String, Double> carrosPopulares = new HashMap<>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }
        };
        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15,2km/l");
        carrosPopulares.put("gol", 16.1);
        System.out.println(carrosPopulares.toString());

        System.out.println("Confira se o modelo tucson está no dicionário");
        System.out.println(carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno");
        System.out.println(carrosPopulares.get("uno"));

        System.out.println("Exiba os modelos");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos.toString());

        System.out.println("Exiba os consumos");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico");
        Double melhoConsumo = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEconomico = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(melhoConsumo)) {
                modeloMaisEconomico = entry.getKey();
                System.out.println("Modelo: " + modeloMaisEconomico + "\nConsumo: " + melhoConsumo);
            }
        }

        System.out.println("Exiba o modelo menos econômico");
        Double piorConsumo = Collections.min(carrosPopulares.values());
        String modeloMenosEconomico = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(piorConsumo)) {
                modeloMenosEconomico = entry.getKey();
                System.out.println("Modelo: " + modeloMenosEconomico + "\nConsumo: " + piorConsumo);
            }
        }

        System.out.println("Exiba a soma dos consumos:");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Exia a média dos consumos");
        System.out.println(soma / carrosPopulares.size());

        System.out.println("Remova os modelos com consumo igual a 15,4km/l");
        System.out.println(carrosPopulares);
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6))
                iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba os carros na ordem informada");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }
        };
        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba pela ordem dos modelos");
        Map<String, Double> carrosPopulares2 = new TreeMap<>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }
        };
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionário");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);

        System.out.println("Confira se a lista está vazia");
        System.out.println(carrosPopulares.isEmpty());
    }
}
