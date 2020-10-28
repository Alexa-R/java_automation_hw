package goodsAction;

import goodsEntity.*;
import goodsList.GoodsList;

import javax.swing.*;
import java.awt.event.*;
import java.util.HashSet;

public class ShowTheNumberOfProductTypes implements ActionListener {
    //Метод выводит на экран количество типов товаров
    public void actionPerformed(ActionEvent e) {
        HashSet<TypeOfGoods> typeOfGoodsHashSet = new HashSet<TypeOfGoods>() {
        };
        for (Goods goods : GoodsList.getGoodsList()) {
            typeOfGoodsHashSet.add(goods.getTypeOfGoods());
        }
        String message = "The number of product types = " + typeOfGoodsHashSet.size();
        JOptionPane.showMessageDialog(null, message, "The number of product types", JOptionPane.PLAIN_MESSAGE);
    }
}

