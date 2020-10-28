package goodsAction;

import goodsEntity.*;
import goodsList.GoodsList;

import javax.swing.*;
import java.awt.event.*;

public class ShowTheAverageCostOfGoods implements ActionListener {
    //Метод выводит на экран среднюю стоимость товара
    public void actionPerformed(ActionEvent e) {
        double sum = 0.0;
        for (Goods goods : GoodsList.getGoodsList()) {
            sum += goods.getCostOfOneUnitOfGoods();
        }
        String message = "The average cost of goods = " + sum / GoodsList.getGoodsList().size() + " BYN";
        JOptionPane.showMessageDialog(null, message, "The average cost of goods", JOptionPane.PLAIN_MESSAGE);
    }
}
