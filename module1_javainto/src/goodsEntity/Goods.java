package goodsEntity;

//В классе создаются поля, конструкторы Товара, геттеры и сеттеры, а также прописан формат вывода

public class Goods {
    private TypeOfGoods typeOfGoods;
    private String nameOfGoods;
    private int countOfGoods;
    private double costOfOneUnitOfGoods;

    public Goods() {}

    public Goods(TypeOfGoods typeOfGoods, String nameOfGoods, int countOfGoods, double costOfOneUnitOfGoods) {
        this.typeOfGoods = typeOfGoods;
        this.nameOfGoods = nameOfGoods;
        this.countOfGoods = countOfGoods;
        this.costOfOneUnitOfGoods = costOfOneUnitOfGoods;
    }

    public Goods(String nameOfGoods, int countOfGoods, double costOfOneUnitOfGoods) {
        this.nameOfGoods = nameOfGoods;
        this.countOfGoods = countOfGoods;
        this.costOfOneUnitOfGoods = costOfOneUnitOfGoods;
    }

    public TypeOfGoods getTypeOfGoods() {
        return typeOfGoods;
    }

    public void setTypeOfGoods(TypeOfGoods typeOfGoods) {
        this.typeOfGoods = typeOfGoods;
    }

    public String getNameOfGoods() {
        return nameOfGoods;
    }

    public void setNameOfGoods(String nameOfGoods) {
        this.nameOfGoods = nameOfGoods;
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
        return "- typeOfGoods = " + typeOfGoods.getDescription() +
                ", nameOfGoods = " + nameOfGoods +
                ", countOfGoods = " + countOfGoods +
                ", costOfOneUnitOfGoods = " + costOfOneUnitOfGoods + " BYN";
    }
}
