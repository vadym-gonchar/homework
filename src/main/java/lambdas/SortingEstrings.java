package lambdas;

import java.util.Arrays;

public class SortingEstrings {
    public static void main(String[] args) {
        String[] wordsArray = {"Wright", "Hays", "Yoder", "Volf", "Sider",
                "Boyd", "Sanders", "Hauerwas", "Bart", "Dunn"};

        Arrays.sort(wordsArray, (s1, s2) -> {
            if (s1.contains("e") && s2.contains("e")) {
                return 0;
            } else if (s1.contains("e")) {
                return -1;
            } else {
                return 1;
            }
        });
        for (String word : wordsArray)
            System.out.println(word);
    }
}