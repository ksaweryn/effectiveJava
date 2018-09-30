package secondEditio.items.chap2.item2;

public class NutritionFacts_TP {
    //From item 2 - Telescoping Pattern

    private final int servingSize;
    private final int serving;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public NutritionFacts_TP(int servingSize, int serving){
        this(servingSize, serving, 0);
    }

    public NutritionFacts_TP(int servingSize, int serving, int calories){
        this(servingSize, serving, calories, 0);
    }

    public NutritionFacts_TP(int servingSize, int serving, int calories, int fat){
        this(servingSize, serving, calories, fat, 0);
    }

    public NutritionFacts_TP(int servingSize, int serving, int calories, int fat, int sodium){
        this(servingSize, serving, calories, fat, sodium, 0);
    }

    public NutritionFacts_TP(int servingSize, int serving, int calories, int fat, int sodium, int carbohydrate){
        this.servingSize = servingSize;
        this.serving = serving;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts_TP cocaCola = new NutritionFacts_TP(240, 8, 100, 0,35, 27);
        System.out.println(cocaCola);
    }

    @Override
    public String toString() {
        return "Servinsize: " + this.servingSize + ", serving: " + serving + ", calories: " + this.calories + ", fat: "
                + this.fat + ", sodium: " + this.sodium + ", carbohydrate: " + this.carbohydrate;
    }
}
