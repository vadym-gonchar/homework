package lambdas;

import java.util.Arrays;

public class AlphabeticalSorting {
    public static void main(String[] args) {
        String[] wordsArray = {"Wright", "Hays", "Yoder", "Volf", "Sider",
                "Boyd", "Sanders", "Hauerwas", "Bart", "Dunn"};

        Arrays.sort(wordsArray, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
        for (String word : wordsArray)
            System.out.println(word);
    }
}