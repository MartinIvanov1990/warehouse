package warehouse.project.service;
//P
import warehouse.project.entity.Product;
import warehouse.project.entity.ShoppingBasket;

import java.util.List;

public interface CustomerService {

    void printAllProducts(List<Product> products);

    Product searchProductByCategory(String category, List<Product> products);

    Product searchProductByName(String name, List<Product> products);

    void addProductToShoppingBasket(int productId, List<Product> products, int quantity, ShoppingBasket shoppingBasket);

    double calculateShoppingBasketPrice(ShoppingBasket shoppingBasket);

    void printCustomerMenu();
}
