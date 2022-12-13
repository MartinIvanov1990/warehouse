package warehouse.project.service;
//test
import warehouse.project.entity.Product;
import warehouse.project.entity.ShoppingBasket;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public void printAllProducts(List<Product> products) {
        //TODO: Print all products with System.out.println if there is one product min
    }

    @Override
    public Product searchProductByCategory(String category, List<Product> products) {
        //TODO: search by category from the array
        return null;
    }

    @Override
    public Product searchProductByName(String name, List<Product> products) {
        //TODO: search by name from the array
        return null;
    }

    @Override
    public void addProductToShoppingBasket(int productId, List<Product> products, int quantity, ShoppingBasket shoppingBasket) {
        // TODO: Add product in shopping basket on current customer
    }

    @Override
    public double calculateShoppingBasketPrice(ShoppingBasket shoppingBasket) {
        //TODO: calculate whole price
        return 0;
    }

    @Override
    public void printCustomerMenu() {
        //TODO: Print customer menu as employee menu
    }

}
