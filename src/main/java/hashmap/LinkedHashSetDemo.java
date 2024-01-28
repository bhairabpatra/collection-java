package hashmap;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public void linkedHashSetMapDemo() {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(7);
        linkedHashSet.add(8);
        System.out.println(linkedHashSet);

    }

    public static void main(String[] args) {
        LinkedHashSetDemo linkedHashSet = new LinkedHashSetDemo();
        linkedHashSet.linkedHashSetMapDemo();
    }

}
