package goodsActions;

import models.Product;
import parser.Parsing;

public class ShowTheAverageCostOfGoods {
    public void showTheAverageCostOfGoods() {
        System.out.print("The average cost of goods: ");
        double sum = 0.0;
        for (Product products : Parsing.getProducts().getProducts()) {
            sum += products.getCostOfOneUnitOfGoods();
        }
        double averageCost = sum / Parsing.getProducts().getProducts().size();
        System.out.printf("%1.2f", averageCost);
    }
}
