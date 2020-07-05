package lambdas;

import java.util.Comparator;

public class SortingEstrings {
    public static void main(String[] args) {
        String[] wordsArray = {"Wright", "Hays", "Yoder", "Volf", "Sider",
                "Boyd", "Sanders", "Hauerwas", "Bart", "Dunn"};

        sort((b, a) -> {
            return Integer.compare(a.indexOf('e'), b.indexOf('e'));
        }, wordsArray);
        for (String word : wordsArray)
            System.out.println(word);
    }

    public static void sort(Comparator<String> comparator, String[] array) {
        String buffer;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 2; j >= i; j--) {

                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    buffer = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = buffer;
                }
            }
        }

    }
}