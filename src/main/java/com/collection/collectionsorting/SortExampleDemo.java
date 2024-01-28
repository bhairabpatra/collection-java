package com.collection.collectionsorting;

import java.util.*;
import java.util.function.Predicate;

public class SortExampleDemo {

    public void sortItem() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(1);
        list.add(9);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    public void sortStudentInfo() { //Comparable

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Galu", "galu@gmail.com"));
        students.add(new Student(4, "Koko", "koko@gmail.com"));
        students.add(new Student(2, "Gugi", "gugi@gmail.com"));
        students.add(new Student(3, "shree", "shree@gmail.com"));

        Collections.sort(students);

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator" + iterator.next());
        }

        System.out.println("**************************************");

        for (Student s : students) {
            System.out.println("forEach" + s);
        }

        students.forEach(System.out::println);
    }

    public void sortEmployee() { //Comparator
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "sonu", "sonu@gmail.com", 3490.89));
        employees.add(new Employee(4, "muna", "muna@gmail.com", 5654.78));
        employees.add(new Employee(2, "runa", "runa@gmail.com", 34325523.7));
        employees.add(new Employee(3, "kanha", "kanha@gmail.com", 23525.78));
        employees.add(new Employee(6, "priyanka", "priyanka@gmail.com", 23525.78));

        System.out.println(employees);

        System.out.println("**************************************"+ '\n');

//        Collections.sort(employees, (e1,e2) -> e1.name.compareTo(e2.name));
        Collections.sort(employees, new EmployeeSort());
        for (Employee employee: employees){
            System.out.println(employee);
        }
        Predicate<Integer> predicate = (number) -> number > 20;
        System.out.println(predicate.test(10));

        String[] std = {"kajal","priyanka","prabhu", "kat"};
        Predicate<String> names = (name) -> name.startsWith("a", 2);
        for (String s: std){
            if(names.test(s)) {
                System.out.println(s);
            }
        }


    }


    public static void main(String[] args) {
        SortExampleDemo sortExampleDemo = new SortExampleDemo();
//        sortExampleDemo.sortItem();
//        sortExampleDemo.sortStudentInfo();
        sortExampleDemo.sortEmployee();
    }
}

class EmployeeSort implements  Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2) {
//        return e1.id - e2.id;
        return e1.name.compareTo(e2.name);
    }
}


