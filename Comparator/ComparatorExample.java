import java.util.*;

class Student{
    String name;
    int marks;
    int age;

    Student(String name, int marks, int age) {
        this.name = name;
        this.marks = marks;
        this.age = age;
    }
    
   
    public String toString() {
        return name + " (" + marks + ", " + age + ")";
    }
}


class sortByName implements Comparator<Student>{
    @Override
   public int compare(Student s1,Student s2){
       return s1.name.compareTo(s2.name);         //for strings only compareTo works,no '-' operator
      
   }
    
    
    
}



public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Alice", 85, 20));
        list.add(new Student("Bob", 90, 19));
        list.add(new Student("Charlie", 85, 22));
        list.add(new Student("David", 70, 18));

 
//   Comparator<Student> com=(s1,s2)->s1.age-s2.age;     using lambda expressions,'-' operator works for only numberTypes
      
     Collections.sort(list,new sortByName());            //using custom class

        System.out.println("Sorted by marks: " + list);
    }
}




