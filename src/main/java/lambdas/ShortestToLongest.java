package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortestToLongest {
    public static void main(String[] args) {
        List<String> wordsArray = new ArrayList<>(Arrays.asList("Wright", "Hays", "Yoder", "Volf", "Sider",
                "Boyd", "Sanders", "Hauerwas", "Bart", "Dunn"));

        wordsArray.sort((first, second) -> Integer.compare(first.length(), second.length()));
        for (String word : wordsArray)
            System.out.println(word);
    }
}