import java.util.HashMap;
import java.util.Map;

public class PriceList {
    private final Map<Integer, Product> priceList = new HashMap<>();

    public void addProduct(int code, Product product) {
        priceList.put(code, product);
    }

    public void replacePrice(int code, Double newPrice) {
        priceList.replace(code, new Product(priceList.get(code).getName(),newPrice));
    }

    public void replaceName(int code, String newName) {
        priceList.replace(code, new Product(newName, priceList.get(code).getPrice()));
    }

    public boolean deleteProduct(int code) {
        if (priceList.containsKey(code)) priceList.remove(code);
        else return false;
        return true;
    }

    public Double countCost(int code, int count) {
        return priceList.get(code).getPrice() * count;
    }

    public Product getProduct(int code) {
        return priceList.get(code);
    }
}

class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}

