package Product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProductList {

    private Map<Product, Integer> products = new HashMap<>();

    public double totalCostProducts() {
        double totalCostProducts = 0.0;
        for (Map.Entry<Product, Integer> product : products.entrySet()) {
            totalCostProducts +=product.getKey().getPrice()*product.getValue();
        }
        return totalCostProducts;
    }

    public void add(Product product) {
        if (product == null) {
            return;
        }
        if (products.containsKey(product)) {
            Integer productCount = this.products.get(product);
            this.products.put(product, ++productCount);
        } else {
            this.products.put(product,1);
        }
    }

    public void remove (Product product) {
        products.remove(product);
        }
}
