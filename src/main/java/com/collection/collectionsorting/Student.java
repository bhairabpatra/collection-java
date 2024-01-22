package com.collection.collectionsorting;

public class Student implements Comparable<Student> {
    int id;
    String name;
    String email;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student studentObj) {
//    return this.id - studentObj.id;
          return this.name.compareTo(studentObj.name);
        // return this.email.compareTo(o.email);
    }
}
