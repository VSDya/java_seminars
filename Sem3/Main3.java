package Sem3;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    /*
    Каталог товаров книжного магазина сохранён в виде двумерного списка List<ArrayList<String>> так,
    что на 0-й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - название книг.
    Напишите метод для заполнения данной структуры.
    [
    [сказки, колобок, курочка рябя, золотой петушок],
    [фантастика, гарри поттер, ночной дозор],
    [роман, война и мир, ромео и джульетта],
    ]
     */
    static List<List<String>> shopBook = new ArrayList<>();

    public static void main(String[] args) {
        addBook("сказки", "колобок");
        addBook("фантастика", "гарри поттер");
        addBook("фантастика", "гарри поттер");
        addBook("сказки", "курочка рябя");
        addBook("роман", "ромео и джульетта");
        addBook("роман", "война и мир");
        addBook("фантастика", "ночной дозор");
        addBook("сказки", "золотой петушок");

        System.out.println(shopBook);
    }

    static void addBook(String genreBook, String nameBook){
        for (int i = 0; i < shopBook.size(); i++) {
            //
            List<String> genreList = shopBook.get(i);
            String genre = genreList.get(0);
            if (genreBook.equalsIgnoreCase(genre)){
                if (!genreList.contains(nameBook)) {
                    genreList.add(nameBook);
                }
                return;
            }
        }

        List<String> list = new ArrayList<>();
        list.add(genreBook);
        list.add(nameBook);
        shopBook.add(list);
    }
}