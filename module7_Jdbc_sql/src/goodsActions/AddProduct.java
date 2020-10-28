package goodsActions;

import models.GoodsModel;
import jdbc.JdbcConnection;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;
import java.util.Scanner;

public class AddProduct{
    private QueryRunner queryRunner = new QueryRunner();

    public void addGoods() throws SQLException {
        GoodsModel goodsModel = new GoodsModel();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the name of product: ");
        String nameOfProduct = scanner.nextLine();
        System.out.println("Write the TypeId of product: ");
        int typeOfProduct = scanner.nextInt();
        System.out.println("Write the count of product: ");
        int countOfProduct = scanner.nextInt();
        System.out.println("Write the cost of one unit of goods: ");
        double costOfOneUnitOfGoods = scanner.nextDouble();

        goodsModel.setProduct_type_id(typeOfProduct);
        goodsModel.setProduct_name(nameOfProduct);
        goodsModel.setProduct_count(countOfProduct);
        goodsModel.setCost_of_unit(costOfOneUnitOfGoods);
        final int insertedRowCount = queryRunner.update(JdbcConnection.connection,
                "INSERT INTO goods VALUES(null, ?,?,?,?);",
                goodsModel.getProduct_type_id(), goodsModel.getProduct_name(), goodsModel.getProduct_count(), goodsModel.getCost_of_unit());
        if (insertedRowCount == 0) {
            throw new RuntimeException("Insert not works");
        }

        System.out.println("New Product:" + goodsModel);
    }
}

