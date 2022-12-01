package warehouse.project.service;

import warehouse.project.entity.Warehouse;

import java.io.FileNotFoundException;

public interface WarehouseService {

    void loginInWarehouse() throws FileNotFoundException;

    Warehouse processFile(String fileName) throws FileNotFoundException;

    void processMenu(String menuName);
}
