package com.company;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("Ivanov",10));
        students.add(new Student("Petrov",4));
        students.add(new Student("Sidorov",25));
        students.add(new Student("VVVVV",34));
        students.add(new Student("DDDDD",89));

        for(Student st: students) {
            //System.out.println(st.getMark() + " " + st.getName());
        }

        SortedSet<Student> result =
    students.subSet(new Student("",10),
                        new Student("",Integer.MAX_VALUE));

        for(Student st: result) {
       //     System.out.println(st.getMark() + " " + st.getName());
        }

        System.out.println(
                students.tailSet(new Student("",10+1)));


/*
    1) Создать две структуры
    ArrayList и TreeSet (100000)
    2)
      long startTime = System.nanoTime();
      for()...
      long endTime = System.nanoTime();
 */



        long

      /*  TreeSet<String> fruits = new TreeSet<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Banana");
        fruits.add("11");

        fruits.contains(); // поиск в множестве

        for(String s: fruits) {
            System.out.print(s + " ");
        }

        Set<Integer> fff = new Set<>();
*/
    }
}
