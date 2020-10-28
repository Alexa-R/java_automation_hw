package goodsActions;

import models.Product;
import parser.Parsing;
import parser.XmlParser;

import java.util.Scanner;

public class AddGoods {
    public void addGoods() {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter type of product: ");
        String typeOfProduct = scanner.nextLine();

        System.out.println("Enter name of product: ");
        String nameOfProduct = scanner.nextLine();

        System.out.println("Enter count of product: ");
        int countOfProduct = scanner.nextInt();

        System.out.println("Enter cost of one unit of goods: ");
        double costOfOneUnitOfGoods = scanner.nextDouble();


        product.setTypeOfProduct(typeOfProduct);
        product.setNameOfProduct(nameOfProduct);
        product.setCountOfGoods(countOfProduct);
        product.setCostOfOneUnitOfGoods(costOfOneUnitOfGoods);
        Parsing.getProducts().getProducts().add(product);

        XmlParser.serialize(Parsing.getProducts(), Parsing.getTestXml());

    }
}
