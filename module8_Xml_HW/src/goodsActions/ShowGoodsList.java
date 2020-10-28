package goodsActions;

import parser.Parsing;

public class ShowGoodsList {
    public void showGoodsList() {
        System.out.println("Goods List:");
        System.out.println(Parsing.getProducts());
    }
}
