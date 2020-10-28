package goodsActions;

import models.Product;
import parser.Parsing;

import java.util.HashSet;

public class ShowTheNumberOfProductTypes {
    public void showTheNumberOfProductTypes() {
        HashSet<String> typesOfProduct = new HashSet<String>() {
        };
        for (Product products : Parsing.getProducts().getProducts()) {
            typesOfProduct.add(products.getTypeOfProduct());
        }
        System.out.println("The number of product types: " + typesOfProduct.size());
    }
}
