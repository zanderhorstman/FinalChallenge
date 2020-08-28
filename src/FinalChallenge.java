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

    make a program that can list user entered words and print them, then organize it by alphabetical order, then reverse
    then capitalize it all.

how are we gonna do it?

    need an array
    we need a line of code that makes everything in an array uppercase.

    refer to "output" above to see what the final product should look like, roughly.

*/
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
        System.out.println("\nReverse sorted version: \n");

        for (int i = 0; i < userInput.length; i++) {
            for (int j = i + 1; j < userInput.length; j++) {
                if (userInput[i].compareTo(userInput[j]) < 0) {
                    temp = userInput[i];
                    userInput[i] = userInput[j];
                    userInput[j] = temp;
                }
            }
            System.out.println(userInput[i]);
        }
        for (int i = 0; i < userInput.length; i++) {
            System.out.println(userInput[i]);
        }
        System.out.println("\nUppercase version of reverse sorted list:\n");
        for (int i = 0; i < userInput.length; i++) {
            if (!userInput[i].equals(userInput[i].toUpperCase()));
                userInput[i] = userInput[i].toUpperCase();
                System.out.println(userInput[i]);
        }
    }
}
