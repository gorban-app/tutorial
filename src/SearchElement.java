import java.util.Arrays;

public class SearchElement {
    public static void main(String[] args) {

     int[] arrays = {770, 105, 51, 136, 360, 600, 99};

     /** №1 way: small number **/
     int minValue = arrays[0];
     for (int i = 1; i < arrays.length; i++) {
         if(arrays[i] < minValue) {
            minValue = arrays[i];
         }
     }
     System.out.println(minValue);

     /** №2 way: small number **/
        Arrays.sort(arrays);
        System.out.println(arrays[0]);
    }
}
