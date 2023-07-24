package HW5;

/*
Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова,
Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова,
Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. Написать программу, которая найдет и выведет
повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Task2 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> names = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\java_seminars\\HW5\\names.txt"));
        String line = br.readLine();
        while (line != null) {
            names.add(line.split(" ")[0]);
            line = br.readLine();
        }
        br.close();
        HashMap<String,Integer> counter = new HashMap<>();
        for(int i=0;i<names.size();i++){
            if(!counter.containsKey(names.get(i))){
                counter.put(names.get(i), 1);
            }
            else counter.put(names.get(i),counter.get(names.get(i))+1);
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> ages = new ArrayList<>(counter.values());
        Collections.sort(ages);
        System.out.println(ages);
        for(int i=ages.size()-1;i>=0;i--){
            for (Entry<String, Integer> entry : counter.entrySet()){
                if(entry.getValue()>1 && entry.getValue()==ages.get(i)){
                    sb.append(entry.getKey()+":"+Integer.toString(entry.getValue()));
                    sb.append(System.lineSeparator());
                    counter.remove(entry.getKey());
                    break;
                }
            }
        }
        System.out.println(sb.toString());

    }
}