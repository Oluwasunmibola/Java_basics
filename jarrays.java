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
        // replace values in array
       vowels[2] = 'x';
    //    fill an array with a value
       Arrays.fill(vowels, startingIndex, endingIndex, 'x');
       Arrays.sort(vowels, startingIndex, endingIndex);
       Arrays.sort(vowels);
       int foundItemIndex = Arrays.binarySearch(vowels, startingIndex, endingIndex, key); // returns index of key if found
       System.out.println(foundItemIndex);

        System.out.println(vowels.length);
        System.out.println(Arrays.toString(vowels));

    int numbers[] = {1, 2, 3, 4, 5};


    int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);
    int subCopyNumbers[] = Arrays.copyOfRange(numbers, startingIndex, endingIndex);

    // Arrays.fill(numbers, 0);
    
    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.toString(copyOfNumbers));
    System.out.println(Arrays.toString(subCopyNumbers));
    System.out.println(Arrays.equals(numbers, copyOfNumbers));
    }
    
}
