package ss3_array_in_java.practice;

public class FindMinimum {
    public static void main(String[] args) {
        int[] array = {1, 2, 34, 4, 3, 2, 2, 23, 123, 123, 121, 33, 1, -12, 0, 12, 41};
        System.out.println("Min of array : " + minvalue(array));

    }

    public static int minvalue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i] ;
            }
        }
        return min;
    }

}
