package HW3;

import java.util.ArrayList;
import java.util.HashMap;

public class Task8 {
    /*
    Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
    Вывести название каждой планеты и количество его повторений в списке.
    Collections.frequency(list, item)
    не решенная задача (надо сделать через кейсы или лист значение)
     */
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();

        planets.add("Mercury");
        planets.add("Venera");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uran");
        planets.add("Neptune");
        planets.add("Saturn");
        planets.add("Mercury");
        planets.add("Mars");
        planets.add("Mercury");
        planets.add("Earth");

        HashMap planCount = new HashMap();
        for(String planet: planets){
            if(planCount.containsKey(planet)){
                int count = (int) planCount.get(planet);
                planCount.put(planet, count++);
            }
            else planCount.put(planet, 1);
        }

        for (Object planet: planCount.keySet()){
            int count = (int) planCount.get(planet);
            System.out.println((planet + ": " + count));
        }
    }
}