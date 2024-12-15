import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача№1");

        int[] intArray = {1, 2, 3};

        double[] doubleArray = {1.57, 7.654, 9.986};

        String[] stringArray = {"Alice", "Bob", "Charlie"};

        System.out.println("Целочисленный массив:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nДробный массив:");
        for (double num : doubleArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nСтроковый массив:");
        for (String name : stringArray) {
            System.out.print(name + " ");
        }
        System.out.println(" ");

        System.out.println("Задача№2");


        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i < intArray.length - 1) {
                System.out.print(",");
            }
            System.out.print("");
        }
        System.out.println(" ");

        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i]);
            if (i < doubleArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("");

        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i]);
            if (i < stringArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("");

        System.out.println("Задача№3");

        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i]);
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print("");
        }
        System.out.println(" ");

        for (int i = doubleArray.length - 1; i >= 0; i--) {
            System.out.print(doubleArray[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println("");

        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.print(stringArray[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println("");

        System.out.println("Задача№4");

        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

