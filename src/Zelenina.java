public class Zelenina extends Flower{
    public Zelenina(String nazev, double cena, double potrebnaPlocha) {
        super(nazev, cena, potrebnaPlocha, 70);
    }

    @Override
    public String getInfo() {
        return "Zelenina: " + name + ", Cena: " + price + ", Potřebná plocha: " + neededArea + "m², Šance na růst: " + chanceOfGrowth + "%";
    }
}

