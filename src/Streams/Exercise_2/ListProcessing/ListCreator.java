package Streams.Exercise_2.ListProcessing;

import java.util.HashMap;
import java.util.Map;

public class ListCreator {

    public Map<String, Double> getCreateList(Map<String, Double> inputListGoods) {
        return new HashMap<>(inputListGoods);
    }
}

