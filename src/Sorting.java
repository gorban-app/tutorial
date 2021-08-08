import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {

        int [] array = new int[10];

        //fill the array with random numbers
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100); //
        }

        System.out.println("Source array: " + Arrays.toString(array));
        // --


        // Bubble sort.
        //long n = System.currentTimeMillis(); // time start
        boolean sort = false;
        while(!sort) {
            sort = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) { // change sign if desc
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    sort = false;
                }
            }
            System.out.println("Bubble sort: " + Arrays.toString(array));
        }
        //System.out.println("Bubble sort time: " + (double) (System.currentTimeMillis() - n));
        // e--

        // sorting a healthy person
        //long m = System.currentTimeMillis(); // time start
        Arrays.sort(array);
        System.out.println("Healthy person: " +Arrays.toString(array));
        //System.out.println("Healthy person time: " + (double) (System.currentTimeMillis() - m));

        //--



    }


}
