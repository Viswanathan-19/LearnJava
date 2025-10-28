import java.util.*;
import java.lang.*;

class Student implements Comparable<Student>{
    String name;
    int marks;
    int age;

    Student(String name, int marks, int age) {
        this.name = name;
        this.marks = marks;
        this.age = age;
    }
    
    @Override
     public int compareTo(Student o){
        //  return o.age-this.age;
         return o.name.compareTo(this.name);
     }

    public String toString() {
        return name + " (" + marks + ", " + age + ")";
    }
}


public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Alice", 85, 20));
        list.add(new Student("Bob", 90, 19));
        list.add(new Student("Charlie", 85, 22));
        list.add(new Student("David", 70, 18));


//   Comparator<Student> com=(s1,s2)->s1.age-s2.age;
      
     Collections.sort(list);    //for an custom class ,we need to implement the Comparable interface & override the compareTo()
                                    //no need for  listInterfaces subclasses like arraylist,vector,linkedlist,stack.
        System.out.println("Sorted by marks: " + list);
    }
}





