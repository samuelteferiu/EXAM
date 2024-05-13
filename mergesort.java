package samis;
import java.util.Arrays;

public class mergesort {
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return; 
        }
        int mid = array.length / 2;
        int[] leftHalf = Arrays.copyOfRange(array, 0, mid);
        int[] rightHalf = Arrays.copyOfRange(array, mid, array.length);

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(array, leftHalf, rightHalf);
    }

    public static void merge(int[] result, int[] leftHalf, int[] rightHalf) {
        int i = 0, j = 0, k = 0;
        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] <= rightHalf[j]) {
                result[k++] = leftHalf[i++];
            } else {
                result[k++] = rightHalf[j++];
            }
        }
        while (i < leftHalf.length) {
            result[k++] = leftHalf[i++];
        }
        while (j < rightHalf.length) {
            result[k++] = rightHalf[j++];
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 9, 4}; 
        mergeSort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}

