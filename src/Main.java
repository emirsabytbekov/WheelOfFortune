import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word1 = "basketball";
        String[] word1Array = {"b", "a", "s", "k", "e", "t", "b", "a", "l", "l"};
        String[] visibleWord = new String[word1Array.length];

        for (int i = 0; i < word1Array.length; i++) {
            visibleWord[i] = "_ ";
            System.out.print(visibleWord[i]);
        }
        System.out.println();

        int rightGuessCount = 0;
        outerLoop:
        while (rightGuessCount < visibleWord.length) {
            String usersGuess = sc.nextLine();

            for (int i = 0; i < word1Array.length; i++) {
                if (Objects.equals(word1Array[i], usersGuess) && !Objects.equals(usersGuess, "guessed")) {
                    visibleWord[i] = usersGuess + " ";
                    rightGuessCount++;
                    word1Array[i] = "guessed";
                }
                else if (Objects.equals(word1, usersGuess)) {
                    System.out.println("b a s k e t b a l l");
                    break outerLoop;
                }
                System.out.print(visibleWord[i]);
            }
            System.out.println();
        }



    }
}