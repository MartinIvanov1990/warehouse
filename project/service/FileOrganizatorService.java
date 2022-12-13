package warehouse.project.service;

import java.util.List;

import warehouse.project.entity.Product;

public interface FileOrganizatorService {
	
	List<?> readFile(String name, boolean isEmployeeFile);
	
	void writeProductsIntoFile(List<Product> products);
}
