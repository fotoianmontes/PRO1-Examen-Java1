import java.util.Arrays;
import java.util.Scanner;

public class numericOperations {
    public static void readNumbers(int[] myArray){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Please, insert the number for the position " + (i+1));
            myArray[i]= sc.nextInt();
            sc.nextLine(); //Buffer cleaning
        }
    }

    public static int additionEven(int[] myArray){
        int addition = 0;
        for (int number:myArray) {
            if (number % 2 == 0){
                addition += number;
            }
        }
        return addition;
    }

    public static int multiplyOdds(int[] myArray){
        int multiply = 1;
        for (int number:myArray) {
            if (number % 2 != 0){
                multiply *= number;
            }
        }
        return multiply;
    }

    public static void sortAscending(int[] myArray){
        Arrays.sort(myArray);
    }
}
