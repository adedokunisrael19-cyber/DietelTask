public class HugeInteger {
    private int [] numbers = new int [40];


    public HugeInteger() {

    }

    public HugeInteger(String input) {
        parse(input);
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

    public HugeInteger add(HugeInteger integer) {
        int leftover = 0;

        HugeInteger result = new HugeInteger();
        for (int i = numbers.length-1; i >=0; i--) {
            int sum = numbers[i]+ integer.numbers[i] + leftover;
            result.numbers[i] = sum % 10;
            leftover  = sum/ 10;
        }
        if(leftover != 0){
            throw  new IllegalArgumentException("");
        }
        return result;
    }

    public HugeInteger  subtract(HugeInteger integer) {
        int borrow = 0;
        HugeInteger result = new HugeInteger();

        for (int i = numbers.length-1; i >=0; i--) {
            int difference = numbers[i] - integer.numbers[i]-borrow;
            if(difference < 0){
                difference += 10;
                borrow  = 1;
            }else{
                borrow = 0;
            }
            result.numbers[i] = difference;
        }
        return  result;
    }
}
