public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

    public Flower(String nazev, double cena, double potrebnaPlocha, int i) {
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

    public void zavlaha(){
        chanceOfGrowth += 0.5;
        System.out.println("rostlina byla zavlazena a zvisila se jeji snace na rust");
        System.out.println();
    }

    public abstract String getInfo();

}
