package hashmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public void mapDemo() {
//        Map<String, String> map = new Map<String, String>() {
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean containsKey(Object key) {
//                return false;
//            }
//
//            @Override
//            public boolean containsValue(Object value) {
//                return false;
//            }
//
//            @Override
//            public String get(Object key) {
//                return null;
//            }
//
//            @Override
//            public String put(String key, String value) {
//                return null;
//            }
//
//            @Override
//            public String remove(Object key) {
//                return null;
//            }
//
//            @Override
//            public void putAll(Map<? extends String, ? extends String> m) {
//
//            }
//
//            @Override
//            public void clear() {
//
//            }
//
//            @Override
//            public Set<String> keySet() {
//                return null;
//            }
//
//            @Override
//            public Collection<String> values() {
//                return null;
//            }
//
//            @Override
//            public Set<Entry<String, String>> entrySet() {
//                return null;
//            }
//        };
        Map<Integer, String> employee = new HashMap<>();
        employee.put(100, "runa");
        employee.put(101, "kuna");
        employee.put(102, "kuna");

        System.out.println("Map size -> " + employee.size());
        System.out.println("Is key exist  ->" + employee.containsKey(102));
        System.out.println("Is key present  ->" + employee.get(102));
        //employee.clear();
        System.out.println("Make the key empty ->" + employee.size());
        System.out.println("Make the key empty ->" + employee.values());
        System.out.println("Get map key if not present  ->" + employee.get(103));

        System.out.println("Get map keySet ->" + employee.keySet());
        System.out.println("Get map entrySet ->" + employee.entrySet());

        Set<Map.Entry<Integer, String>> emp = employee.entrySet();
//        System.out.println(emp);
        for (Map.Entry<Integer, String> employees : emp) {
            System.out.println(employees.getKey() + " " + employees.getValue());
        }
    }

    public void  mapWithObjDemo(){
        Student S1 = new Student(1,"virat", "virat@gmail.com");
        Student S2 = new Student(2,"rohit", "rohit@gmail.com");
        Student S3 = new Student(3,"rahul", "rahul@gmail.com");

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(101,S1);
        studentMap.put(102,S2);
        studentMap.put(103,S3);

        System.out.println(studentMap);
        Set<Integer> stdKeys = studentMap.keySet();
        for(Integer key: stdKeys){
            System.out.println("The student key is -> " + key);
        }

        Set<Map.Entry<Integer, Student>> allStd =  studentMap.entrySet();
      //  allStd.clear();
        System.out.println(allStd.size());
        if(!allStd.isEmpty()) {
            for (Map.Entry<Integer, Student> std : allStd) {
                System.out.println(std.getValue());
            }
        }else {
            System.out.println("The map is empty");
        }

    }

    public static void main(String[] args) {
        System.out.println("This is an example of the map");
        MapDemo hashMapDemo = new MapDemo();
//        hashMapDemo.mapDemo();
        hashMapDemo.mapWithObjDemo();
    }

}

