public class MissingNumber {
    public static int findMissingNumber(int[] nums) {
    int nextNumber = nums[0];
    for (int i = 1; i < nums.length; i++) {
        nextNumber++;
        if (nextNumber != nums[i]) {
            nextNumber = nums[i];
        }

    }

    return nextNumber;
    }
}