package Streams.Exercise_1.ListProcessing;

import java.util.List;
import java.util.stream.Collectors;


public class Filter {
    private List<String> words;

    public Filter(List<String> words) {
        this.words = words;
    }

    public List<String> getFilterWords(String indexFilter) {
        return words.stream()
                .filter(word -> word.startsWith(indexFilter))
                .collect(Collectors.toList());
    }

}

