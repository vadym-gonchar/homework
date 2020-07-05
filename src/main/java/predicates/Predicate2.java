package predicates;

public class Predicate2 {
    public static void main(String[] args) {

        String x = ElementUtils.betterElement("guys", "hello", (s1, s2) -> s1.length() > s2.length());
        String first = StringUtils.betterString("HI", "hi", (s1, s2) -> s1.toLowerCase().equals(s2));
        int y = ElementUtils.betterElement(1,2, (s1, s2) -> s1 > s2);
        System.out.println(x);
        System.out.println(first);
        System.out.println(y);
    }
}

class ElementUtils {
    public static <T> T betterElement(T s1, T s2, TwoElementPredicate <T> elements){
        return elements.compare(s1, s2) ? s1 : s2;
        }

    public interface TwoElementPredicate <T>{
        boolean compare(T t1, T t2);
    }
}