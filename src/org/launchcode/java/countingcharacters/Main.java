package org.launchcode.java.countingcharacters;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) throws IOException {
        String txt = ReadFile.readFile("/Users/Admin/IdeaProjects/java-web-dev-exercises/src/org/launchcode/java/countingcharacters/testFile.txt", StandardCharsets.UTF_8);
        txt = txt.replaceAll("[\\W]", "");
        System.out.println(txt);
        char[] chars = txt.toCharArray();
        HashMap<String, Integer> charMap = new HashMap<>();
    }
}
