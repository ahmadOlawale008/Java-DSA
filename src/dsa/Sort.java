package dsa;

public class Sort {
    public static int[] bubbleSort(int[] nums) {
        int temp;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] >= nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                System.out.println();
                for (int num : nums) {
                    System.out.print(num + " ");
                }
            }

        }
        return nums;
    }

    public static int[] selectionSort(int[] nums) {
        int size = nums.length;
        int minIndex;
        int temp;
        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
