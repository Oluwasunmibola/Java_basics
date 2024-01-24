package Java_basics;
import java.util.ArrayList;
import java.util.Comparator;

public class array_list {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        System.out.println(numbers.toString());
        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 2);
            // System.out.println(number * 2);
        });
        numbers.sort(Comparator.reverseOrder());
        numbers.remove(2);
        numbers.remove(Integer.valueOf(4));
        numbers.set(2, Integer.valueOf(30));
       
        System.out.println(numbers.toString());
        System.out.println(numbers.size());
        System.out.println(numbers.contains(Integer.valueOf(10)));
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.get(0));
    }
}
