package org.launchcode.java.exercises;
import java.util.Scanner;
public class Strings2 {

    public static void main(String[] args) {
        String word;
        Scanner input = new Scanner(System.in);

        String sentence =
                "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        System.out.println("Enter word:");
        word = input.nextLine();
        input.close();

        word = word.toLowerCase();
        sentence = sentence.toLowerCase();

        while (sentence.contains(word)) {
            String str1 = sentence.substring(0, sentence.indexOf(word));
            String str2 = sentence.substring((sentence.indexOf(word) + word.length() + 1));
            sentence = str1.concat(str2);
        }
        System.out.println(sentence);
    }
}

