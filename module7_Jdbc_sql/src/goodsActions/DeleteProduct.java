package goodsActions;

import models.GoodsModel;
import jdbc.JdbcConnection;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;
import java.util.Scanner;

public class DeleteProduct{
    private QueryRunner queryRunner = new QueryRunner();

    public void deleteProduct() throws SQLException {
        Scanner scan = new Scanner(System.in);
        GoodsModel goodsModel = new GoodsModel();
        System.out.print("Enter id of the product: ");
        int id = Integer.parseInt(scan.next());

        goodsModel.setId(id);
        final int deletedRowCount = queryRunner.update(JdbcConnection.connection,
                "DELETE FROM goods WHERE id = ?;",
                goodsModel.getId());
        if (deletedRowCount == 0) {
            throw new RuntimeException("There aren't such product!");
        }
        System.out.println("The product is deleted.");
    }
}
