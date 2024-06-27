package dsa;

public class Search {
    int[] nums;
    int target;
    int steps;

    public Search(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

    public int linearSearch() {
        for (int i = 0; i < this.nums.length; i++) {
            this.steps++;
            System.out.printf("Steps %s \n", this.steps);
            if (nums[i] == this.target) return i;
        }
        return -1;
    }

    public int binarySearch(int left, int right) {
//        int left = 0;
//        int right = this.nums.length - 1;
/*
        while (left <= right) {
            this.steps++;
            System.out.printf("Steps %s \n", this.steps);
            int middle = (left + right) / 2;
            if (this.nums[middle] == this.target) {
                return middle;
            }
            if (this.nums[middle] < this.target) {
                left = middle + 1;
            }
            if (this.nums[middle] > this.target) {
                right = middle - 1;
            }

        }
*/
        if (left <= right) {
            int mid = (left + right) / 2;
            if (this.nums[mid] > this.target) {
                return new Search(this.nums, this.target).binarySearch(left, mid - 1);
            }
            if (this.nums[mid] == this.target) {
                return mid;
            } else {
                return new Search(this.nums, this.target).binarySearch(mid + 1, right);
            }
        }
        return -1;
    }
}
