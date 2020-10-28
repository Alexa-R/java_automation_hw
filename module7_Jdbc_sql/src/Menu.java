import goodsActions.*;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    public void callMenu() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the program!\n" + "\"S\" - To get started\n" + "\"E\" - To exit");

        String input = scanner.nextLine();
        while (!"E".equals(input)) {
            System.out.println("What do you want to do?" +
                    "\n1 - to see the product list;" +
                    "\n2 - to see the number of product types;" +
                    "\n3 - to see the total number of products;" +
                    "\n4 - to see the average cost of goods;" +
                    "\n5 - to see the average cost of each type of product;" +
                    "\n6 - to add new product;" +
                    "\n7 - to delete the product;" +
                    "\nE - to Exit" +
                    "\nWrite the symbol you want!");
            input = scanner.nextLine();
            switch (input) {
                case ("1"): {
                    new ShowGoodsList().showGoodsList();
                }
                break;
                case ("2"): {
                    new ShowTheNumberOfProductTypes().showTheNumberOfProductTypes();
                }
                break;
                case ("3"): {
                    new ShowTheTotalNumberOfProducts().showTheTotalNumberOfProducts();
                }
                break;
                case ("4"): {
                    new ShowTheAverageCostOfGoods().showTheAverageCostOfGoods();
                }
                break;
                case ("5"): {
                    new ShowTheAverageCostOfEachTypeOfProduct().showTheAverageCostOfEachTypeOfProduct();
                }
                break;
                case ("6"): {
                    new AddProduct().addGoods();
                }
                break;
                case ("7"): {
                    new DeleteProduct().deleteProduct();
                }
                break;
                default:
                    System.out.println("Unfortunately, there is no such action in the program! Please, try again.");
            }
            System.out.println("\nDo you want to continue?" +
                    "\n      Y - to continue" +
                    "\n      E - to exit");
            input = scanner.nextLine();
        }
        System.out.println("Good bye!");
    }
}
