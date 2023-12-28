package Streams.Exercise_1.ListProcessing;

import java.util.Arrays;
import java.util.List;

public class ListCreator {
    public List<String> getCreateList(String wordsString) {
        return Arrays.asList(wordsString.split(","));
    }
}

