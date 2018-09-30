package secondEditio.items.chap2.item2;

public class NutritionFacts_BP {
    //From item 2 - Java Builder Pattern
    private final int servingSize;
    private final int serving;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        //Required fields
        private final int servingSize;
        private final int serving;

        //Optional parameters
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int serving) {
            this.servingSize = servingSize;
            this.serving = serving;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFacts_BP build() {
            return new NutritionFacts_BP(this);
        }
    }
    private NutritionFacts_BP(Builder builder){
        servingSize = builder.servingSize;
        serving = builder.serving;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts_BP cocaCola = new NutritionFacts_BP.Builder(240, 8).calories(100).sodium(35).
                carbohydrate(27).fat(300).build();
        System.out.println(cocaCola);
    }

    @Override
    public String toString() {
        return "Serving size: " + servingSize + ", serving: " + serving + ", calories: " + calories + ", fat: "
                + fat + ", sodium: " + sodium + ", carbohydrate: " + carbohydrate;
    }
}
