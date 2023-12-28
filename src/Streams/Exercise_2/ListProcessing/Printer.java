package Streams.Exercise_2.ListProcessing;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Printer {


    public void printGoods(Map<String, Double> goods) {
        AtomicInteger counter = new AtomicInteger(1);
        goods.forEach((name, price) -> System.out.println(counter.getAndIncrement() + ". " + name + " - " + price));
    }
}
