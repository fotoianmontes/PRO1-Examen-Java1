import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        Realiza un programa en JAVA que cree un array de 10 números leídos por teclado y mostrar la suma
        de los números pares, la multiplicación de los números impares y ordenar el array de forma ascendente.
         */

        int[] myArray = new int[10];

        numericOperations.readNumbers(myArray);

        System.out.println("The addition of the even numbers is " + numericOperations.additionEven(myArray));

        System.out.println("The multiplication of the odd numbers is " + numericOperations.multiplyOdds(myArray));

        numericOperations.sortAscending(myArray);

        System.out.println(Arrays.toString(myArray));

    }
}