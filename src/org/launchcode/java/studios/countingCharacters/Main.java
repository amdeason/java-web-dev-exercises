package org.launchcode.java.studios.countingCharacters;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) throws IOException {
        String txt = ReadFile.read("src/org/launchcode/java/countingcharacters/testFile.txt", StandardCharsets.UTF_8);
        txt = txt.replaceAll("[\\W]", "");
        System.out.println(txt);
        char[] chars = txt.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char c : chars) {
            if (!charMap.containsKey(c)) {
                charMap.put(c, 1);
            } else {
                charMap.put(c, charMap.get(c) + 1);
            }
        }

        System.out.println(charMap);
    }
}
