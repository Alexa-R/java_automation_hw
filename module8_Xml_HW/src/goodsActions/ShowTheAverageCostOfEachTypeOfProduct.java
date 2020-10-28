package goodsActions;

import models.Product;
import parser.Parsing;

import java.util.HashSet;

public class ShowTheAverageCostOfEachTypeOfProduct {
    public void showTheAverageCostOfEachTypeOfProduct() {
        double sum = 0.0;
        int count = 0;
        HashSet<String> typesOfProduct = new HashSet<String>() {
        };
        for (Product products : Parsing.getProducts().getProducts()) {
            typesOfProduct.add(products.getTypeOfProduct());
        }
        System.out.print("The average cost of each type of product: \n");
        for (String typeOfProducts : typesOfProduct) {
            for (Product products : Parsing.getProducts().getProducts()) {
                if (typeOfProducts == products.getTypeOfProduct()) {
                    sum += products.getCostOfOneUnitOfGoods();
                    count++;
                }
            }
            System.out.println(typeOfProducts + ": " + sum / count);
            sum = 0;
            count = 0;
        }
    }
}
