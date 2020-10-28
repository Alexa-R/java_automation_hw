package goodsActions;

import models.Product;
import parser.Parsing;

public class ShowTheTotalNumberOfProducts {
    public void showTheTotalNumberOfProducts() {
        System.out.print("The total number of products: ");
        int sum = 0;
        for (Product products : Parsing.getProducts().getProducts()) {
            sum += products.getCountOfGoods();
        }
        System.out.println(sum);
    }
}
