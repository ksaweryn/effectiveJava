package secondEditio.items.chap2.item2;

public class NutritionFacts_JBP {
    //From item 2 - Java Bean Pattern

    private int servingSize;
    private int serving;
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;

    public NutritionFacts_JBP(){
        //Empty constructor
    }

    //getters & setters

    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public int getServing() {
        return serving;
    }

    public void setServing(int serving) {
        this.serving = serving;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getSodium() {
        return sodium;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts_JBP cocaCola = new NutritionFacts_JBP();
        cocaCola.setCalories(240);
        cocaCola.setServingSize(4);
        cocaCola.setServing(1);
        cocaCola.setCarbohydrate(100);
        cocaCola.setFat(100);
        cocaCola.setSodium(100);
        System.out.println(cocaCola);
    }

    @Override
    public String toString() {
        return "Servinsize: " + this.getServingSize() + ", serving: " + getServing() + ", calories: " + this.getCalories() + ", fat: "
                + this.getFat() + ", sodium: " + this.getSodium() + ", carbohydrate: " + this.getCarbohydrate();
    }
}
