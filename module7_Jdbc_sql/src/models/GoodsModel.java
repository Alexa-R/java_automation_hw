package models;

public class GoodsModel {
    private int id;
    private int product_type_id;
    private String product_name;
    private int product_count;
    private double cost_of_unit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduct_type_id() {
        return product_type_id;
    }

    public void setProduct_type_id(int product_type_id) {
        this.product_type_id = product_type_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_count() {
        return product_count;
    }

    public void setProduct_count(int product_count) {
        this.product_count = product_count;
    }

    public double getCost_of_unit() {
        return cost_of_unit;
    }

    public void setCost_of_unit(double cost_of_unit) {
        this.cost_of_unit = cost_of_unit;
    }

    @Override
    public String toString() {
        return "\n================\n" +
                "id: " + id +
                "\nProduct type id: " + product_type_id +
                "\nName: " + product_name +
                "\nCount: " + product_count +
                "\nCost of one unit: " + cost_of_unit + " BYN";

    }
}
