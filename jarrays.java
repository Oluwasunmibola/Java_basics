package Java_basics;
import java.util.Arrays;
public class jarrays {
    public static void main(String[] args){
        // char vowels[] = new char[5];

        // vowels[0] = 'a';
        // vowels[1] = 'e';
        // vowels[2] = 'i';
        // vowels[3] = 'o';
        // vowels[4] = 'u';
        // Alternative approach to declear arrays
        char vowels[] = {'e', 'u', 'a', 'o', 'i'};

        int startingIndex = 1;
        int endingIndex = 4;
        char key = 'o';
        //replace values in array
       // vowels[2] = 'x';
       Arrays.sort(vowels, startingIndex, endingIndex);
       Arrays.sort(vowels);
       int foundItemIndex = Arrays.binarySearch(vowels, startingIndex, endingIndex, key); // returns index of key if found
       System.out.println(foundItemIndex);

        System.out.println(vowels.length);
        System.out.println(Arrays.toString(vowels));
    }
    
}
