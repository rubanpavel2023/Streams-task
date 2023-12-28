package Streams.Exercise_3.ListProcessing;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class TempPrinter {
    public void printTemperaturesList(Map<String, Integer> temperatures) {
        AtomicInteger counter = new AtomicInteger(1);
        temperatures.forEach((day, temp) -> System.out.println(counter.getAndIncrement() + ". " + day + " - " + temp));
    }
}
