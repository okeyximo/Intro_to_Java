package com.okeyximo;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int revisedNumber = reverse(number);

        for (int i = 0; i < getDigitCount(number); i++) {
            switch (revisedNumber % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Number");
                    break;
            }
            revisedNumber /= 10;
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber *= 10;
            reversedNumber += number % 10;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return (-1);
        int count = 0;
        if (number == 0) {
            count = 1;
        }
        while (number > 0) {
            count++;
            number /= 10;
        }
        return (count);
    }

}

/**
 * Write a method called numberToWords with one int parameter named number.
 *
 * The method should print out the passed number using words for the digits.
 * If the number is negative, print "Invalid Value".
 * To print the number as words, follow these steps:
 * 1. Extract the last digit of the given number using the remainder operator.
 * 2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit,
 * those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit,
 * e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
 * 3. Remove the last digit from the number.
 * 4. Repeat Steps 2 through 4 until the number is 0.
 * <p>
 * The logic above is correct, but in its current state, the words will be printed in reverse order.
 * For example, if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four".
 * To overcome this problem, write a second method called reverse.
 * <p>
 * The method reverse should have one int parameter and return the reversed number (int). For example,
 * if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.
 * <p>
 * Use the method reverse within the method numberToWords in order to print the words in the correct order.
 * <p>
 * Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001).
 * The logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero".
 * To solve this problem, write a third method called getDigitCount.
 * <p>
 * The method getDigitCount should have one int parameter called number and return the count of the digits in that number.
 * If the number is negative, return -1 to indicate an invalid value.
 * For example, if the number has a value of 100,
 * the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).
 * <p>
 * Example Input/Output - getDigitCount method
 * <p>
 * * getDigitCount(0); should return 1 since there is only 1 digit
 * <p>
 * * getDigitCount(123); should return 3
 * <p>
 * * getDigitCount(-12); should return -1 since the parameter is negative
 * <p>
 * * getDigitCount(5200); should return 4 since there are 4 digits in the number
 * <p>
 * Example Input/Output - reverse method
 * <p>
 * * reverse(-121); should  return -121
 * <p>
 * * reverse(1212); should return  2121
 * <p>
 * * reverse(1234); should return 4321
 * <p>
 * * reverse(100); should return 1
 * <p>
 * Example Input/Output - numberToWords method
 * <p>
 * * numberToWords(123); should print "One Two Three".
 * <p>
 * * numberToWords(1010); should print "One Zero One Zero".
 * <p>
 * * numberToWords(1000); should print "One Zero Zero Zero".
 * * numberToWords(-12); should print "Invalid Value" since the parameter is negative.
 *
 *  HINT: Use a for loop to print zeroes after reversing the number.
 * As seen in a previous example, 100 reversed becomes 1,
 * but the method numberToWords should print "One Zero Zero".
 * To get the number of zeroes, check the difference between the digit count
 * from the original number and the reversed number.
 * NOTE: When printing words, each word can be in its own line. For example, numberToWords(123); can be:
 * One
 * Two
 * Three
 * They don't have to be separated by a space.
 * NOTE: The methods numberToWords, getDigitCount,
 * reverse should be defined as public static like we have been doing so far in the course.
 * NOTE: In total, you have to write 3 methods.
 *
 * NOTE: Do not add a main method to the solution code.
 */
