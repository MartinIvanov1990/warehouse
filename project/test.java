package warehouse.project ;

import static com.project.projectTest.WarehouseClass.sc;

public class test {
    public static void main(String[] args) {


        System.out.println("enter number ");
        String input;


        while (!validateInput(input = sc.nextLine())) {

        }
        int num = Integer.parseInt(input);
        System.out.println(input);
    }
    private static boolean validateInput(String input) {

        try {
            int commandNumber = Integer.parseInt(input);
            if (commandNumber <= 0 || commandNumber > 12) {
                System.out.println("Invalid command! Try again!");
                return false;
            }

            return true;
        } catch (Exception NumberFormatException) {
            System.out.println("Invalid command! Try again!");
            return false;

        }
    }
}
