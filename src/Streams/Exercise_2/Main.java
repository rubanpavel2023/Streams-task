package Streams.Exercise_2;

import Streams.Exercise_2.ListProcessing.Filter;
import Streams.Exercise_2.ListProcessing.ListCreator;
import Streams.Exercise_2.ListProcessing.Printer;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> inputProducts = new HashMap<>();
        inputProducts.put("Product1", 1.99);
        inputProducts.put("Product2", 1.55);
        inputProducts.put("Product3", 2.00);
        inputProducts.put("Product4", 2.54);
        inputProducts.put("Product5", 0.95);
        inputProducts.put("Product6", 3.12);

        ListCreator productListCreator = new ListCreator();
        Map<String, Double> products = productListCreator.getCreateList(inputProducts);

        Filter productFilter = new Filter();
        Map<String, Double> filteredProducts = productFilter.getFilterList(products, 2.00);

        Printer productPrinter = new Printer();
        productPrinter.printGoods(filteredProducts);
    }
}
