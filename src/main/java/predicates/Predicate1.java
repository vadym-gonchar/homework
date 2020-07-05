package predicates;

public class Predicate1 {
    public static void main(String[] args) {

        String longer = StringUtils.betterString("guys", "hello", (s1, s2) -> s1.length() > s2.length());
        String first = StringUtils.betterString("String 1", "String 2", (s1, s2) -> true);
        System.out.println(longer);
        System.out.println(first);
    }
}

class StringUtils {
    public static String betterString(String s1, String s2, TwoStringPredicate predicate) {
        if (predicate.method(s1, s2)) {
            return s1;
        } else {
            return s2;
        }
    }

    public interface TwoStringPredicate {
        boolean method(String s1, String s2);
    }
}