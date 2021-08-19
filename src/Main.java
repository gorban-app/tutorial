import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] array = new int[scn.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }


        boolean sort = false;
        while (!sort) {
            sort = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    sort = false;
                }
            }
        }
        for (int i : array) System.out.print(i + " ");
    }

}