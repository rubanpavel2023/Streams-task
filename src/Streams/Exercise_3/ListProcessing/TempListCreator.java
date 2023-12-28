package Streams.Exercise_3.ListProcessing;

import java.util.HashMap;
import java.util.Map;

public class TempListCreator {

    public Map<String, Integer> getCreateTemperatureList(Map<String, Integer> inputTemperatures) {
        return new HashMap<>(inputTemperatures);
    }
}

