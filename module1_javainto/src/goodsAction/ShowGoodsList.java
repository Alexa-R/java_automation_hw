package goodsAction;

import goodsEntity.*;
import goodsList.GoodsList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowGoodsList implements ActionListener {
    //Метод выводит на экран список товаров
    public void actionPerformed(ActionEvent e) {
        StringBuilder message = new StringBuilder();
        message.append("Goods List:\n");
        for (Goods goods : GoodsList.getGoodsList()) {
            message.append(goods.toString()).append('\n');
        }

        JOptionPane.showMessageDialog(null, message, "Goods List", JOptionPane.PLAIN_MESSAGE);
    }
}
