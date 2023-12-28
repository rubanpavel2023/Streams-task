package Streams.Exercise_2.ListProcessing;

import java.util.HashMap;
import java.util.Map;

public class Filter {

    public Map<String, Double> getFilterList(Map<String, Double> goods, double maxPrice) {
        Map<String, Double> filteredProducts = new HashMap<>();
        for (Map.Entry<String, Double> entry : goods.entrySet()) {
            if (entry.getValue() <= maxPrice) {
                filteredProducts.put(entry.getKey(), entry.getValue());
            }
        }
        return filteredProducts;
    }
}

