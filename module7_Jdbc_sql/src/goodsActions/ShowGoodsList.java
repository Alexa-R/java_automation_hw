package goodsActions;

import models.GoodsModel;
import jdbc.JdbcConnection;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class ShowGoodsList{
    private QueryRunner queryRunner = new QueryRunner();

    public void showGoodsList() throws SQLException {
        ResultSetHandler<List<GoodsModel>> resultSetSelectAllHandler = new BeanListHandler(GoodsModel.class);
        List<GoodsModel> goodsModels = queryRunner.query(JdbcConnection.connection, "SELECT*FROM goods", resultSetSelectAllHandler);
        System.out.println(goodsModels);
    }
}

