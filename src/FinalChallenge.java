
/*


OUTPUT:
Enter 10 words: kiwi pineapple apple banana orange grapes watermelon cherry strawberry melon

Original Order:
kiwi pineapple apple banana orange grapes watermelon cherry strawberry melon

Alphabetical Order:
apple banana cherry grapes kiwi melon orange pineapple strawberry watermelon

Reversed Alphabetical Order:
watermelon strawberry pineapple orange melon kiwi grapes cherry banana apple

Upper case array:
APPLE BANANA CHERRY GRAPES KIWI MELON ORANGE PINEAPPLE STRAWBERRY WATERMELON
*/
/*
PseudoCode:

what do we want to achieve?

    make a program that can hold and list words in the order that the user enters them, alphabetical order, and reverse.

how are we gonna do it?

    need an array called dictionary, that you can all enter all in one string.
    we need 2 separate bubble sorting blocks,
    we need a line of code that makes everything in an array uppercase.

    print all arrays, and our extra line.

    refer to "output" above to see what the final product should look like, roughly.

*/
import java.util.Arrays;
import java.util.Scanner;

public class FinalChallenge {
    public static void main(String[] args) {
        int numOfWords = 10;
        String temp;
        String[] userInput = new String[numOfWords];
        Scanner keybd = new Scanner(System.in);
        System.out.println("10 total words will be entered.");
        for (int i = 0; i < numOfWords; i++) {
            System.out.print("Please enter word #" + (i + 1) + ": ");
            userInput[i] = keybd.nextLine();
        }
        System.out.println("Currently added words:");
        for (int i = 0; i < numOfWords; i++) {
            System.out.println(userInput[i]);
        }
        System.out.println("\nAlphabetically sorted version: \n");
        for (int i = 0; i < userInput.length; i++) {
            for (int j = i + 1; j < userInput.length; j++) {
                if (userInput[j].compareTo(userInput[i]) < 0) {
                    temp = userInput[i];
                    userInput[i] = userInput[j];
                    userInput[j] = temp;
                }
            }
            System.out.println(userInput[i]);
        }

        for (int i = 0; i > userInput.length; i++) {
            if (!userInput[i].equals(userInput[i].toUpperCase()));
                userInput[i] = userInput[i].toUpperCase();
                System.out.println(userInput[i]);
        }

    }
}
