package Streams.Exercise_3.ListProcessing;

import java.util.HashMap;
import java.util.Map;

public class TempFilter {

    public Map<String, Integer> getFilterTemperatures(Map<String, Integer> temperatures, int minTemp, int maxTemp) {
        Map<String, Integer> filterTemperatures = new HashMap<>();
        for (Map.Entry<String, Integer> entry : temperatures.entrySet()) {
            if (entry.getValue() >= minTemp && entry.getValue() <= maxTemp) {
                filterTemperatures.put(entry.getKey(), entry.getValue());
            }
        }
        return filterTemperatures;
    }
}

