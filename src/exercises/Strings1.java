package exercises;
import java.util.Scanner;
public class Strings1 {

    public static void main(String[] args) {
        String word;
        boolean wasFound;
        Scanner input = new Scanner(System.in);

        String sentence =
                "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                        "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                        "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                        "thought Alice 'without pictures or conversation?'";
       System.out.println("Enter a word to search for: ");
       word = input.nextLine();
       input.close();

       word.toLowerCase();
       sentence.toLowerCase();

       wasFound = sentence.contains(word);

       System.out.println(wasFound);
    }
}
