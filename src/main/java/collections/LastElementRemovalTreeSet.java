package collections;

import java.util.TreeSet;

public class LastElementRemovalTreeSet {
    public static void main(String[] args) {
        TreeSet <Integer> set = new TreeSet();
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println("Original Set: " + set);
        set.pollLast();
        System.out.println("Set after the last element removal" + set);
    }
}