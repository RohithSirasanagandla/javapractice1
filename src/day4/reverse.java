package day4;
public class reverse {
    public static void main(String[] args) {
        int number = 12345;
        int reversed = reverseNumber(number);
        System.out.println("Reversed number: " + reversed);
    }

    public static int reverseNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }

        return reversed;
    }
}

