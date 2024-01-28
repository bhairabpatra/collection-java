package hashmap;

import java.time.Period;
import java.util.*;

public class HashSetMapDemo {

    public void hashSetDemo(){
        Set<Integer> roll = new HashSet<>(0, 12);
        roll.add(1);
        roll.add(2);
        roll.add(3);
        roll.add(4);
        roll.add(5);

        System.out.println(roll.size());

        Iterator<Integer> integers = roll.iterator();
        while (integers.hasNext()){
            System.out.println(integers.next());
        }
    }

    public void hashSetObjDemo(){
        Set<Student> roll = new HashSet<>();
        roll.add(new Student(101,"john"));
        roll.add(new Student(102,"Sina"));
        roll.add(new Student(103,"Jack"));
        roll.add(new Student(104,"Dorshe"));
        roll.add(new Student(105, "Smith"));

        System.out.println("siz of the set ->" + roll.size());
        System.out.println("**********iterator with Spliterator**********");

        Spliterator<Student> test =  roll.spliterator();
        test.forEachRemaining(System.out::println);

        System.out.println("**********iterator with Iterator**********");
        Iterator<Student> std = roll.iterator();
        while (std.hasNext()) {
            System.out.println(std.next());
        }
    }
    public static void main(String[] args){
    HashSetMapDemo hashSetMapDemo = new HashSetMapDemo();
    hashSetMapDemo.hashSetDemo();
    hashSetMapDemo.hashSetObjDemo();
    }
}
