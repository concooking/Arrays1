import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        int[] numbers = new int[]{1, 2, 3};

        double[] decimels = {2.21, 5.23, 7.43};

        String[] timeOfDay = {"morning", "day", "evening" };
        // Задача 2
        System.out.println("Задача 2");
        int[] arr1 = new int[]{1, 2, 3};
        double[] arr2 = {2.21, 5.23, 7.43};
        String[] arr3 = {"morning", "day", "evening" };

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i != arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задача 3
        System.out.println("Задача 3");
        int[] arr4 = new int[]{1, 2, 3};
        double[] arr5 = new double[]{2.21, 5.23, 7.43};
        String[] arr6 = new String[]{"morning", "day", "evening" };

        for (int i = arr4.length - 1; i >= 0; i--) {
            System.out.print(arr4[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arr5.length - 1; i >= 0; i--) {
            System.out.print(arr5[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arr6.length - 1; i >= 0; i--) {
            System.out.print(arr6[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // Задача 4
        System.out.println("Задача 4");
        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}




