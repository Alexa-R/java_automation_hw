package goodsAction;

import goodsEntity.TypeOfGoods;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddGoodsInList implements ActionListener {
    private JLabel typeOfProductText = new JLabel("Enter type of product: ");
    private JComboBox editComboBox;
    private JLabel nameOfProductText = new JLabel("Enter name of product: ");
    private TextField nameOfProductParam = new TextField(10);
    private JLabel countOfProductText = new JLabel("Enter count of product: ");
    private TextField countOfProductParam = new TextField(10);
    private JLabel costOfOneUnitOfGoodsText = new JLabel("Enter cost of one unit of goods: ");
    private TextField costOfOneUnitOfGoodsParam = new TextField(10);
    private JButton buttonSaveProduct = new JButton("Save product");
    
    public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame("New Product");
        frame.setBounds(550, 200, 400, 200);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(5, 1, 2, 2));

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;

        TypeOfGoods[] items = {
                TypeOfGoods.DRESS,
                TypeOfGoods.SHIRT,
                TypeOfGoods.SKIRT,
                TypeOfGoods.SWEATER,
                TypeOfGoods.TROUSERS
        };
        editComboBox = new JComboBox(items);

        frame.add(typeOfProductText, c);
        frame.add(editComboBox, c);

        frame.add(nameOfProductText, c);
        frame.add(nameOfProductParam, c);

        frame.add(countOfProductText, c);
        frame.add(countOfProductParam, c);

        frame.add(costOfOneUnitOfGoodsText, c);
        frame.add(costOfOneUnitOfGoodsParam, c);

        buttonSaveProduct.addActionListener(new ButtonSaveProduct());
        frame.add(buttonSaveProduct);


        /*firstParam.setMinimumSize(new Dimension(50, 25));
        secondParam.setMinimumSize(new Dimension(50, 25));*//*


        JSplitPane splitPaneTypeOfProduct = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, typeOfProductText, typeOfProductParam);
        JSplitPane splitPaneNameOfProduct = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, secondText, secondParam);
        JSplitPane splitPaneCountOfProduct = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, secondText, secondParam);
        JSplitPane splitPaneCostOfOneUnitOfGoods = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, secondText, secondParam);

        JSplitPane splitPaneMain = new JSplitPane(JSplitPane.VERTICAL_SPLIT, splitPane, splitPane2);

        frame.add(splitPane3);
*/


    }

    public JComboBox getEditComboBox() {
        return editComboBox;
    }

    public String getNameOfProductParam() {
        return String.valueOf(nameOfProductParam);
    }

    public TextField getCountOfProductParam() {
        return countOfProductParam;
    }

    public TextField getCostOfOneUnitOfGoodsParam() {
        return costOfOneUnitOfGoodsParam;
    }

}
