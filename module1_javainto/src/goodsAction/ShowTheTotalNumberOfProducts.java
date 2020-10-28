package goodsAction;

import goodsEntity.*;
import goodsList.GoodsList;

import javax.swing.*;
import java.awt.event.*;

public class ShowTheTotalNumberOfProducts implements ActionListener {
    //Метод выводит на экран общее количество товаров
    public void actionPerformed(ActionEvent e) {
        int sum = 0;
        for (Goods list : GoodsList.getGoodsList()) {
            sum += list.getCountOfGoods();
        }
        String message = "The total number of products = " + sum;
        JOptionPane.showMessageDialog(null, message, "The total number of products", JOptionPane.PLAIN_MESSAGE);

    }
}
