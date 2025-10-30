package GenericsTypesInMethod;

import java.util.*;

public class Main{
    public static void main(String[] args){
        List<Integer> nums = List.of(1,2,3);
        Utils.show("Hello");
        System.out.println(Utils.add(10, 20));       // 30.0
        System.out.println(Utils.sumAll(nums));      // 6.0

    }
}
class Utils {
    // Generic Method
    public static <T> void show(T value) {
        System.out.println(value);
    }

    // Bounded generic
    public static <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    // Wildcard examples
    public static void printAll(List<?> list) {
        for (Object obj : list) System.out.println(obj);
    }

    public static double sumAll(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) sum += n.doubleValue();
        return sum;
    }

    public static void addIntegers(List<? super Integer> list) {
        list.add(100);
    }
}
