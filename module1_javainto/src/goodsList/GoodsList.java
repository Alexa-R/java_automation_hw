package goodsList;

import goodsEntity.Goods;
import goodsEntity.TypeOfGoods;

import java.util.*;

//Создание списка товаров

public class GoodsList {
    private static List<Goods> goodsList = new ArrayList<Goods>() {{
        add(new Goods(TypeOfGoods.DRESS, "Mauri", 56, 99.99));
        add(new Goods(TypeOfGoods.DRESS, "Safari", 15, 103.50));
        add(new Goods(TypeOfGoods.DRESS, "Sleeve", 21, 149.99));


        add(new Goods(TypeOfGoods.SHIRT, "PlanaB", 25, 69.99));
        add(new Goods(TypeOfGoods.SHIRT, "Pocket", 30, 98.98));
        add(new Goods(TypeOfGoods.SHIRT, "Chalacro", 29, 54.20));


        add(new Goods(TypeOfGoods.TROUSERS, "Berlina", 72, 85.99));
        add(new Goods(TypeOfGoods.TROUSERS, "MOM", 33, 56.99));
        add(new Goods(TypeOfGoods.TROUSERS, "Bowie", 49, 86.54));


        add(new Goods(TypeOfGoods.SWEATER, "Nune06", 62, 119.99));
        add(new Goods(TypeOfGoods.SWEATER, "WCamo Insp HDY", 36, 59.10));
        add(new Goods(TypeOfGoods.SWEATER, "Ikonik", 72, 40.99));


        add(new Goods(TypeOfGoods.SKIRT, "Elna", 36, 20.59));
        add(new Goods(TypeOfGoods.SKIRT, "Gardens", 30, 129.25));
        add(new Goods(TypeOfGoods.SKIRT, "Windgates", 48, 89.40));
    }};

    public static List<Goods> getGoodsList() {
        return goodsList;
    }
}
