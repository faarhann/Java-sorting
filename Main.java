import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {3, 2, 5, 4, 8};

        System.out.println( Arrays.toString(values) );

        swap(values, 1, 0);
        System.out.println( Arrays.toString(values) );

        swap(values, 0, 3);
        System.out.println( Arrays.toString(values) );

    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i=0; i<array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int index = 0;
        int smallest = smallest(array);
        for (int i=0; i<array.length; i++){
          if (smallest == array[i]){
              index = i;
          }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {

        int startingFrom = index;
        for (int i=index; i<array.length; i++){
            if (array[startingFrom] > array[i]){
                startingFrom = i;
            }
        }
        return startingFrom;

    }

    public static void swap(int[] array, int index1, int index2) {

        int indexOneOld = index1;
        array[index1] = array[index2];
        array[index2] = indexOneOld;
    }

    public static void sort(int[] array) {
        for (int i=0; i<array.length; i++){
            swap(array, indexOfTheSmallestStartingFrom(array, i), i);
        }
    }




}
