package goodsEntity;

// Поле тип товара имеет тип enum. Каждый тип товара имеет описание, которое в дальнейшем будет выводиться на экран пользователю.

public enum TypeOfGoods {
    SHIRT("Shirt"),
    DRESS("Dress"),
    SWEATER("Sweater"),
    TROUSERS("Trousers"),
    SKIRT("Skirt");

    private String description;

    TypeOfGoods(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
