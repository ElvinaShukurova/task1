import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PriceListTest {


    @Test
    public void replacePriceTest(){
        PriceList test = new PriceList();
        test.addProduct(1, new Product("apple", 2.20));
        test.addProduct(2, new Product("watermelon", 5.15));
        test.addProduct(3, new Product("lemon", 3.87));
        test.replacePrice(1, 3.00);
        test.replacePrice(2, 17.09);
        test.replacePrice(3, 1234.56);
        assertEquals(test.getProduct(1).getPrice(), 3.00);
        assertEquals(test.getProduct(2).getPrice(), 17.09);
        assertEquals(test.getProduct(3).getPrice(), 1234.56);
    }

    @Test
    public void replaceNameTest(){
        PriceList test = new PriceList();
        test.addProduct(1, new Product("apple", 2.20));
        test.addProduct(2, new Product("watermelon", 5.15));
        test.addProduct(3, new Product("lemon", 3.87));
        test.replaceName(1, "pear");
        test.replaceName(2, "melon");
        test.replaceName(3, "plum");
        assertEquals(test.getProduct(1).getName(), "pear");
        assertEquals(test.getProduct(2).getName(), "melon");
        assertEquals(test.getProduct(3).getName(), "plum");
    }
    @Test
    public void deleteProductTest(){
        PriceList test = new PriceList();
        test.addProduct(1, new Product("apple", 2.20));
        test.addProduct(2, new Product("watermelon", 5.15));
        test.addProduct(3, new Product("lemon", 3.87));
        assertTrue(test.deleteProduct(1));
        assertTrue(test.deleteProduct(2));
        assertTrue(test.deleteProduct(3));
    }
    @Test
    public void countCostTest(){
        PriceList test = new PriceList();
        test.addProduct(1, new Product("apple", 2.20));
        test.addProduct(2, new Product("watermelon", 5.15));
        test.addProduct(3, new Product("lemon", 3.87));
        assertEquals(test.countCost(1, 3), 6.60, 1e-6);
        assertEquals(test.countCost(2, 0), 0);
        assertEquals(test.countCost(3, 1), 3.87);
    }

}
