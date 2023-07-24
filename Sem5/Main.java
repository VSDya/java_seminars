package Sem5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    /*
    Создать структуру для хранения паспортов и фамилий сотрудников организации.
    123456 Иванов
    321456 Васильев
    234561 Петрова
    234432 Иванов
    654321 Петрова
    345678 Иванов
    Вывести данные по сотруднику с фамилией Иванов.
     */
    public static void main(String[] args) {
        Passports passports = new Passports();
        passports.addNote("123456", "Иванов");
        passports.addNote("321456", "Васильев");
        passports.addNote("234561", "Петрова");
        passports.addNote("234432", "Иванов");
        passports.addNote("654321", "Петрова");
        passports.addNote("345678", "Иванов");

        System.out.println(passports.findByName("Иванов"));
    }
}
