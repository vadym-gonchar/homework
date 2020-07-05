package lambdas;

import java.util.Arrays;

public class AlphabeticalSorting {
    public static void main(String[] args) {
        String[] wordsArray = {"Wright", "Hays", "Yoder", "Volf", "Sider",
                "Boyd", "Sanders", "Hauerwas", "Bart", "Dunn"};

        Arrays.sort(wordsArray);
        for (String word : wordsArray)
            System.out.println(word);
    }
}