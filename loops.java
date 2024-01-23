package Java_basics;

public class loops {
    public static void main(String[] args){
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number = 5;
        int sum = 0;
        for(int index=0; index < numbers.length; index++){
            sum += numbers[index];
        }
        for(int multiplier = 1; multiplier < 10; multiplier++){
            System.out.printf("%d * %d = %d \n", number, multiplier, number * multiplier);
        }
        System.out.println(sum);

        for(int newNumber = 1; newNumber <= 10; newNumber++){
            for(int multiplier = 1; multiplier <= 10; multiplier++){
                System.out.printf("%d * %d = %d \n", newNumber, multiplier, newNumber * multiplier);
            }
        }

        for(int num = 1; num <= 50; num++){
            if(num % 2 == 1){
                System.out.println(num);
            }
        }

        int someNumbers[] = {1, 2, 3, 4, 5};

        for(int someNumber : someNumbers){
            sum += someNumber;
           
        }
        System.out.println(sum);
    }
    
}
