public class HugeInteger {
    private int [] numbers = new int [40];


    public HugeInteger(int [] numbers) {
        this.numbers = numbers;
    }


    public void parse(String input) {
        int n = input.length();

        for (int i = 0; i < n; i++) {
            char figure = input.charAt(i);
            int valueGotten = figure - '0';

            int numberParse = 40 - input.length() + i;

            numbers[numberParse] = valueGotten;
        }
    }

    public String toString() {
        int index =0;
        while (index < numbers.length && numbers[index]==0) {
            index++;
        }

        if (index == numbers.length) {
            return "0";
        }
        StringBuilder string = new StringBuilder();
        for (int i = index; i < numbers.length; i++) {
            string.append(numbers[i]);
        }
        return string.toString();
    }

    public void add(HugeInteger integer) {
        int leftover = 0;
        for (int i = 0; i < numbers.length-1; i++) {
            int sum = numbers[i]+ integer.numbers[i+1];
            numbers[i] = sum % 10;
            leftover  = sum/ 10;
        }
        if(leftover != 0){
            throw  new IllegalArgumentException("");
        }
    }

//    public void subtract(HugeInteger hugeInteger){
//        if (isLessThan(hugeInteger)) throw new IllegalArgumentException("greater than the number");
//
//        int count = 0;
//        for (int index = numbers.length - 1; index >= 0; index--) {
//            int digitOne = numbers[index] - count;
//            int digitTwo = hugeInteger.numbers[index];
//
//            if (digitOne < digitTwo) {
//                digitOne += 10;
//                count = 1;
//            } else count = 0;
//
//            numbers[index] = digitOne - digitTwo;
//        }
//    }

}
