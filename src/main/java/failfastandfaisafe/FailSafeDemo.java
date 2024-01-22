package failfastandfaisafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeDemo {
    public void failSafe() {

        CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<>();
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

    public void failSafeHashMapDemo() {
        ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();
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
//            System.out.println(value);
        }
        hashMap.entrySet() .forEach(System.out::println);
    }

    public static void main(String[] args) {
        FailSafeDemo failSafeDemo = new FailSafeDemo();
        failSafeDemo.failSafe();
        failSafeDemo.failSafeHashMapDemo();
    }
}
