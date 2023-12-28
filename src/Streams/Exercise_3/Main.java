package Streams.Exercise_3;

import Streams.Exercise_3.ListProcessing.TempFilter;
import Streams.Exercise_3.ListProcessing.TempListCreator;
import Streams.Exercise_3.ListProcessing.TempPrinter;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> inputTemperatures = new HashMap<>();
        inputTemperatures.put("Monday", 13);
        inputTemperatures.put("Tuesday", 15);
        inputTemperatures.put("Wednesday", 1);
        inputTemperatures.put("Thursday", 11);
        inputTemperatures.put("Friday", 2);
        inputTemperatures.put("Saturday", 10);
        inputTemperatures.put("Sunday", 14);

        TempListCreator temperatureListCreator = new TempListCreator();
        Map<String, Integer> temperatures = temperatureListCreator.getCreateTemperatureList(inputTemperatures);

        TempFilter temperatureFilter = new TempFilter();
        Map<String, Integer> filteredTemperatures = temperatureFilter.getFilterTemperatures(temperatures, 10, 13);

        TempPrinter temperaturePrinter = new TempPrinter();
        temperaturePrinter.printTemperaturesList(filteredTemperatures);
    }
}

