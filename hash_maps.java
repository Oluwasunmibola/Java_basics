package Java_basics;
import java.util.HashMap;

public class hash_maps {
    public static void main(String[] args){
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();
        examScores.put("Math", 75);
        examScores.put("Sociology", 85);
        examScores.put("English", 95);
        examScores.put("AI", 100);

        examScores.forEach((key, value) -> {
            examScores.replace(key, value - 10);
        });
        System.out.println(examScores.toString());
        // examScores.putIfAbsent("Math", 70);
        // examScores.replace("Math", 70);
        // examScores.remove("Sociology");
        // System.out.println(examScores.containsKey("Math"));
        // System.out.println(examScores.toString());
        // System.out.println(examScores.size());
        // System.out.println(examScores.getOrDefault("Religion", -1));
        System.out.println(examScores.containsValue(100));
    }
    
}
