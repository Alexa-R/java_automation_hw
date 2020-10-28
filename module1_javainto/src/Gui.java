import goodsAction.*;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {
    private JButton buttonProductList = new JButton("to see the product list");
    private JButton buttonNumberOfProductTypes = new JButton("to see the number of product types");
    private JButton buttonTotalNumberOfProducts = new JButton("to see the total number of products");
    private JButton buttonAverageCostOfGoods = new JButton("to see the average cost of goods");
    private JButton buttonAverageCostOfEachTypeOfProduct = new JButton("to see the average cost of each type of product");
    private JButton buttonAddNewProduct = new JButton("to add new product in goods list");
    private JLabel greeting = new JLabel("       Welcome to the program!\n What do you want to do?");


    public Gui() {
        super("Accounting Software"); // заголовок окна
        this.setBounds(100, 100, 400, 350); //устанавливаем размеры и расположение окна
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane(); // клиентская область окна
        container.setLayout(new GridLayout(7, 1, 2, 2)); // выбираем компоновщик
        container.add(greeting); //добавляем текст

        //Создание и добавление кнопки, вызывающей метод, который выводит на экран список товаров
        buttonProductList.addActionListener(new ShowGoodsList());
        container.add(buttonProductList);

        //Создание и добавление кнопки, вызывающей метод, который выводит на экран количество типов товаров
        buttonNumberOfProductTypes.addActionListener(new ShowTheNumberOfProductTypes());
        container.add(buttonNumberOfProductTypes);

        //Создание и добавление кнопки, вызывающей метод, который выводит на экран общее количество товаров
        buttonTotalNumberOfProducts.addActionListener(new ShowTheTotalNumberOfProducts());
        container.add(buttonTotalNumberOfProducts);

        //Создание и добавление кнопки, вызывающей метод, который выводит на экран среднюю стоимость товара
        buttonAverageCostOfGoods.addActionListener(new ShowTheAverageCostOfGoods());
        container.add(buttonAverageCostOfGoods);

        //Создание и добавление кнопки, вызывающей метод, который выводит на экран среднюю стоимость товара каждого типа
        buttonAverageCostOfEachTypeOfProduct.addActionListener(new ShowTheAverageCostOfEachTypeOfProduct());
        container.add(buttonAverageCostOfEachTypeOfProduct);

        buttonAddNewProduct.addActionListener(new AddGoodsInList());
        container.add(buttonAddNewProduct);
    }
}
