package Streams.Exercise_1.ListProcessing;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class Printer {
    public void printWords(List<String> names) {
        AtomicInteger counter = new AtomicInteger(1);
        names.forEach(name -> System.out.println(counter.getAndIncrement() + ". " + name));
    }


}

