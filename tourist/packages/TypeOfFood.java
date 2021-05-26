package tourist.packages;

public enum TypeOfFood {
    NOT_INCLUDED ("Not included"),
    ONLY_BREAKFAST ("Only breakfast"),
    ALL_INCLUSIVE ("All inclusive");

    private String foodType;

    TypeOfFood(String foodType) {
        this.foodType = foodType;
    }
}

