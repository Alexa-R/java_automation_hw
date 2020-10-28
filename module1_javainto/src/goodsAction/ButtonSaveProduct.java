package goodsAction;

import goodsEntity.Goods;
import goodsEntity.TypeOfGoods;
import goodsList.GoodsList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonSaveProduct extends AddGoodsInList implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        Goods newProduct = new Goods(TypeOfGoods.DRESS, getNameOfProductParam(),
                Integer.parseInt(String.valueOf(getCountOfProductParam())),
                Double.parseDouble(String.valueOf(getCostOfOneUnitOfGoodsParam())));
        GoodsList.getGoodsList().add(newProduct);
        newProduct.toString();
    }
}
