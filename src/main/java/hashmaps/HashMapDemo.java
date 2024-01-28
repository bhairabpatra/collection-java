package hashmaps;

import com.collection.collectionsorting.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public void hashmapDemo(){
        HashMap<Integer, String> employee = new HashMap<>();
        employee.put(100,"runa");
        employee.put(101,"kuna");
        employee.put(102, "kuna");

        Set<Map.Entry<Integer, String>> emp = employee.entrySet();
        System.out.println(emp.size());


        for(Map.Entry<Integer, String> employees : emp){
                System.out.println(employees.getValue());
            System.out.println(employees.getKey());
        }

    }

    public static void main(String[] args){
        System.out.println("This is an example of the hash map");
        HashMapDemo hashMapDemo = new HashMapDemo();
        hashMapDemo.hashmapDemo();
    }

}
