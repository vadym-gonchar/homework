package collections;

import java.util.ArrayList;
import java.util.List;

public class ReplaceElementArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("zero");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        System.out.println("Original list: " + list);
        list.set(2, 2);
        System.out.println("List after an element removal" + list);
    }
}