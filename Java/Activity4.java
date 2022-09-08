import java.util.Arrays;

class Activity4 {
    static void InsertionSort(int arraynum[]) {
        int size = arraynum.length, i;
        for (i = 1; i < size; i++) {
            int key = arraynum[i];
            int j = i - 1;
            while (j >= 0 && key < arraynum[j]) {
                arraynum[j + 1] = arraynum[j];
                --j;
            }
            arraynum[j + 1] = key;
        }
    }
    public static void main(String args[]) {
        int[] sample = { 67, 52, 90, 45, 12 };
        InsertionSort(sample);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(sample));
    }
}