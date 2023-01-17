import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        int[] array2 = {1, 2, 3};

        int[] array3 = {130000, 180000, 220000, 380000, 530000};

        // Задание 2
        String comma = ", ";
        for (int i = 0; i < array1.length; i++) {
            if (i == 2) {
                comma = " ^-^ ";
            }
            System.out.print(array1[i] + comma);
        }
        System.out.print("\n");


        for (int j = 0; j < array2.length; j++) {
            comma = ", ";
            if (j == 2) {
                comma = " ";
            }
            System.out.print(array2[j] + comma);

        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            comma = ", ";
            if (i == 4) {
                comma = "  ";
            }
            System.out.print(array3[i] + comma);
        }
        System.out.println();
        // Задание 3
        int temporary1[] = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            temporary1[array1.length - 1 - i] = array1[i];
        }
        for (int i = 0; i < array1.length; i++) {
            array1[i] = temporary1[i];
            comma = ", ";
            if (i == 2) {
                comma = "  ";
            }
            System.out.print(array1[i] + comma);
        }
        System.out.println();
        int[] temporary2 = new int[array2.length];
        for (int j = 0; j < array2.length; j++) {
            temporary2[array2.length - 1 - j] = array2[j];
        }
        for (int j = 0; j < array2.length; j++) {
            array2[j] = temporary2[j];
            comma = ", ";
            if (j == 2) {
                comma = "  ";
            }

            System.out.print(array2[j] + comma);
        }
        System.out.println();
        for (int i = array3.length - 1; i >= 0; i--) {
            comma = ", ";
            if (i == 0) {
                comma = "  ";
            }
            System.out.print(array3[i] + comma);
        }
        // Домашнее задание 4
        System.out.println();
        int[] temp = new int[array1.length];
        for (int i = 0; i < 3; i++) {
            temp[array1.length - 1 - i] = array1[i];
        }
        for (int i = 0; i < array1.length; i++) {
            array1[i] = temp[i];
            if (array1[i] % 2 != 0) {
                array1[i] += 1;
            }
        }
        System.out.print(Arrays.toString(array1));
    }
}

