package goodsAction;

import goodsEntity.*;
import goodsList.GoodsList;

import javax.swing.*;
import java.awt.event.*;
import java.util.HashSet;

public class ShowTheAverageCostOfEachTypeOfProduct implements ActionListener {
    //Метод выводит на экран среднюю стоимость товара каждого типа
    public void actionPerformed(ActionEvent e) {
        StringBuilder message = new StringBuilder();
        double sum = 0.0;
        int count = 0;
        HashSet<TypeOfGoods> typeOfGoodsHashSet = new HashSet<TypeOfGoods>() {
        };
        for (Goods goods : GoodsList.getGoodsList()) {
            typeOfGoodsHashSet.add(goods.getTypeOfGoods());
        }
        message.append("The average cost of each type of product: \n");
        for (TypeOfGoods typeOfGoods : typeOfGoodsHashSet) {
            for (Goods goods : GoodsList.getGoodsList()) {
                if (typeOfGoods == goods.getTypeOfGoods()) {
                    sum += goods.getCostOfOneUnitOfGoods();
                    count++;
                }

            }
            message.append(typeOfGoods.getDescription()).append(": ").append(String.format("%5.2f", sum / count).replace(',', '.')).append(" BYN\n");
            sum = 0.0;
            count = 0;
        }
        JOptionPane.showMessageDialog(null, message, "The average cost of each type of product", JOptionPane.PLAIN_MESSAGE);
    }
}
