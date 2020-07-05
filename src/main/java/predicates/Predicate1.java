package predicates;

public class Predicate1 {
    public static void main(String[] args) {

        String longer = StringUtils.betterString("guys", "hello", (s1, s2) -> s1.length() > s2.length());
        String first = StringUtils.betterString("HI", "hi", (s1, s2) -> s1.toLowerCase().equals(s2));
        System.out.println(longer);
        System.out.println(first);
    }
}

class StringUtils {
    public static String betterString(String s1, String s2, TwoStringPredicate predicate) {
        return predicate.compare(s1, s2) ? s1 : s2;
    }

    public interface TwoStringPredicate {
        boolean compare(String t1, String t2);
    }
}