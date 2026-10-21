//public class ConsecutiveNumbers {
//    public static int SumOfConsecutiveNumbers(int[] array) {
//        int maximumcount = 1;
//        int count = 0;
//        for(int i = 0; i < array.length-1; i++){
//            if(array[i+1] - array[i] == 1 ){
//                count++;
//            } else if (Math.max(maximumcount, count)) {
//                maximumcount = count;
//            }
//        }
//        return count;
//    }
//}


public class  ConsecutiveNumbers {

    public static int findMissingNumber(int[] numbers) {
        int n = numbers.length + 1;

        // Sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Sum of numbers in the array
        int actualSum = 0;

        for (int number : numbers) {
            actualSum += number;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 6};

        int missing = findMissingNumber(numbers);

        System.out.println("Missing number: " + missing);
    }
}