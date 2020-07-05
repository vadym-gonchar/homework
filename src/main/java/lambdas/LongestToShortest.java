package lambdas;

import java.util.Arrays;

public class LongestToShortest {
    public static void main(String[] args) {
        String[] wordsArray = {"Wright", "Hays", "Yoder", "Volf", "Sider",
                "Boyd", "Sanders", "Hauerwas", "Bart", "Dunn"};

        Arrays.sort(wordsArray, (s1, s2) -> (s2.length() - s1.length()));
        for (String word : wordsArray)
            System.out.println(word);
    }
}