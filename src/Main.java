import dsa.Sort;
import dsa.Sort.*;

public class Main {
    public static void main(String[] args) {
        int[] arrs = {0, 2, 4, 12, -100, 10, 3, 7, 5, 100};
        int[] nums = {6, 5, 2, 8, 9, 4};
        int[] sorted = Sort.insertionSort(arrs);
        for(int i: sorted){
            System.out.println(i);
        }
    }
}