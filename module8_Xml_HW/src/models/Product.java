package models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {
    private String typeOfProduct;
    private String nameOfProduct;
    private int countOfGoods;
    private double costOfOneUnitOfGoods;

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(String typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public int getCountOfGoods() {
        return countOfGoods;
    }

    public void setCountOfGoods(int countOfGoods) {
        this.countOfGoods = countOfGoods;
    }

    public double getCostOfOneUnitOfGoods() {
        return costOfOneUnitOfGoods;
    }

    public void setCostOfOneUnitOfGoods(double costOfOneUnitOfGoods) {
        this.costOfOneUnitOfGoods = costOfOneUnitOfGoods;
    }

    @Override
    public String toString() {
        return "\n- typeOfGoods = " + typeOfProduct +
                ", nameOfGoods = " + nameOfProduct +
                ", countOfGoods = " + countOfGoods +
                ", costOfOneUnitOfGoods = " + costOfOneUnitOfGoods + " BYN";
    }
}
