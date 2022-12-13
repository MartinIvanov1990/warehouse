package warehouse.project;

import java.io.FileNotFoundException;

import warehouse.project.service.WarehouseService;
import warehouse.project.service.WarehouseServiceImpl;

public class WarehouseManagementSystem {
	
    public static void main(String[] args) throws FileNotFoundException {
    	WarehouseService warehouseService = new WarehouseServiceImpl();
    	warehouseService.loginInWarehouse();
    }

}
