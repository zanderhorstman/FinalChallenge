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
import java.util.*;


public class FinalChallenge {
    public static void main(String[] args) {
        int max;
        String userInput = "";                             //Creates string that will store the user's inputs
        Scanner keybd = new Scanner(System.in);             //new scanner for user inputs
        System.out.print("Enter words: (Words should be separated by a space ' '): ");
        userInput = keybd.nextLine();
        String input[] = userInput.split(" ");
        List<String> dictionary = new ArrayList<String>(Arrays.asList(input));
        //dictionary.add(); is usable here
        System.out.println("Original order: " + dictionary);     //array works, list prints as intended.

        Collections.sort(dictionary);

        System.out.println("Alphabetically sorted order: " + dictionary);

        Collections.sort(dictionary, Collections.reverseOrder());

        System.out.println("Reverse sorted order: " + dictionary);

        for (String str : dictionary) {
            str.toUpperCase();
            System.out.println(str);        // this doesnt work here for some reason
        }
        //if (int i = 0; i > max; i++;) {

        //}
    }

}
