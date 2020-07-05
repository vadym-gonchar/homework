package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestToShortest {
    public static void main(String[] args) {
        List<String> wordsArray = new ArrayList<>(Arrays.asList("Wright", "Hays", "Yoder", "Volf", "Sider",
                "Boyd", "Sanders", "Hauerwas", "Bart", "Dunn"));

        wordsArray.sort((second, first) -> Integer.compare(first.length(), second.length()));
        for (String word : wordsArray)
            System.out.println(word);
    }
}