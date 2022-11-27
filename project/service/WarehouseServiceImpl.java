package warehouse.project.service;

import warehouse.project.entity.Employee;
import warehouse.project.entity.Product;
import warehouse.project.entity.Warehouse;

import java.io.File;
import java.io.FileNotFoundException;  // за какво е това ? да питам Да
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.classestest.Main.age;

public class WarehouseServiceImpl implements WarehouseService {
    Scanner sc = new Scanner(System.in);
    private EmployeeServiceImpl employeeService;
    private CustomerServiceImpl customerService;

    public void loginInWarehouse() throws FileNotFoundException {

        String employeeData = "";
        String productData = "";
        System.out.println("Enter file name to upload the information for employee");
        String inputFile1 = sc.nextLine();
        String inputFile2 = sc.nextLine();


        while (!inputFile1.equalsIgnoreCase("employee.csv")) {
            System.out.println("Invalid input! Please write employee.csv :");
            inputFile1 = sc.nextLine();
        }
        Scanner fileReader = new Scanner(new File(inputFile1), "windows-1251");
        employeeData = fileReader.nextLine();

        while (!inputFile1.equalsIgnoreCase("products.csv")) {
            System.out.println("Invalid input! Please write products.csv :");
            inputFile1 = sc.nextLine();
        }

        fileReader = new Scanner(new File(inputFile2));
        productData = fileReader.nextLine();


        //TODO: Implement logic to enter file's names and invoke 'processFile' method

        System.out.println("Welcome to our Shop! Are you Customer Or Worker ?");
        String input = sc.nextLine();
        while (!input.equalsIgnoreCase("customer") && !input.equalsIgnoreCase("worker")) {
            System.out.println("Invalid input! Please write Customer Or Worker:");
            input = sc.nextLine();
        }

        //TODO: if person is logged in as customer or employee successfully then setup service needed

        if (input.equalsIgnoreCase("customer")) {
            this.customerService = new CustomerServiceImpl();
        } else {
            this.employeeService = new EmployeeServiceImpl();
        }
//        if (CUSTOMER) {
//            this.customerService = new CustomerServiceImpl();
//        } else if (EMPLOYEE) {
//            this.employeeService = new EmployeeServiceImpl();
//        }

        //TODO: invoke processFile method


        //TODO: invoke processMenu method

    }

    public Warehouse processFile(String fileName) throws FileNotFoundException {

        Scanner scan = new Scanner(new File("products.csv"));
        scan.useDelimiter(",");   //sets the delimiter pattern

        List<Product> products = new ArrayList<Product>();
        List<Employee> employees = new ArrayList<Employee>();

        while (scan.hasNext())  //returns a boolean value
        {

            String productInfo = scan.next();
            int count = 1;
            int id = 0;
            String name = "";
            double price = 0;
            int quantity = 0;
            String type = "";
            String color = "";
            String expirationDate = "";
            switch (count) {
                case 1:
                    id = Integer.parseInt(productInfo);
                    break;
                case 2:
                    name = productInfo;
                    break;
                case 3:
                    price = Double.parseDouble(productInfo);
                    break;
                case 4:
                    quantity = Integer.parseInt(productInfo);
                    break;
                case 5:
                    type = productInfo;
                    break;
                case 6:
                    color = productInfo;
                    break;
                case 7:
                    expirationDate = productInfo;
                    break;
            }
            count++;
            if (count == 8) {
                count = 1;
            }
            Product product = new Product(id, name, price, quantity, type, color, expirationDate);
            products.add(product);

        }

        scan = new Scanner(new File("employee.csv"));
        scan.useDelimiter(",");
        while (scan.hasNext())  //returns a boolean value
        {
            int count = 1;
            String employeeInfo = scan.next();
            int id = 0;
            String lastName = "";
            String firstName = "";
            double salary = 0;
            switch (count) {
                case 1:
                    id = Integer.parseInt(employeeInfo);
                    break;
                case 2:
                    firstName = employeeInfo;
                    break;
                case 3:
                    lastName = employeeInfo;
                    break;
                case 4:
                    int age = Integer.parseInt(employeeInfo);
                    break;
                case 5:
                    salary = Double.parseDouble(employeeInfo);
                    break;
            }
            count++;
            if (count == 6) {
                count = 1;
            }

            Employee employee = new Employee(id, firstName, lastName, age, salary);
            employees.add(employee);
        }
        Warehouse warehouse = new Warehouse(products, employees);


        // TODO: Implement logic to read csv file

        // TODO: Invoke parse data from csv file to Warehouse object and return it
        return null;  // it shouldn't be null
    }

    public void processMenu(String menuName) {
        switch (menuName) {
            case "CUSTOMER":
                customerService.printCustomerMenu();
            case "EMPLOYEE":
                employeeService.login(5, "Gogo");
        }
    }
}