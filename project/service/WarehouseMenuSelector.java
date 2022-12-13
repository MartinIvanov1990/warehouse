package warehouse.project.service;

import warehouse.project.entity.Customer;
import warehouse.project.entity.Warehouse;

public interface WarehouseMenuSelector {
    void selectOption(int optionNumber, boolean isEmployee, Warehouse warehouse, Customer customer);
}
