package failfastandfaisafe;

import java.util.*;

public class FailFastDemo {

    public void failFastArrayListDemo() {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);

        for (int roll : al) {
            if (roll == 20) {
                al.add(100);
            }
        }
        System.out.println(al);
    }

    public void failFastHashMapDemo() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "muna");
        hashMap.put(2, "runa");
        hashMap.put(3, "Kuna");

        Set<Integer> keyset = hashMap.keySet();
        Iterator<Integer> iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (value == 2) {
                hashMap.put(5, "Test");
            }
            System.out.println(value);
        }
//        hashMap.keySet().forEach(System.out::println);
    }

    public static void main(String[] args) {
        FailFastDemo failFastDemo = new FailFastDemo();
        failFastDemo.failFastArrayListDemo();
//        failFastDemo.failFastHashMapDemo();
    }
}
