package warehouse.project;

public enum ServiceOperations {
    PRINT_ALL_PRODUCTS (1), PRINT_PRODUCT_BY_OPTION (2)

    private int operationNumber;


    ServiceOperations(int operationNumber) {
        this.operationNumber = operationNumber;
    }

    //TODO: Add all options
}
