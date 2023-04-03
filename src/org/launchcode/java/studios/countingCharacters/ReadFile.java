package org.launchcode.java.studios.countingCharacters;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
    public static String read(String path, Charset encoding) throws IOException {
        return Files.readString(Paths.get(path), encoding);
    }
}
