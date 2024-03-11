public class Kvetina extends Flower{
    public Kvetina(String nazev, double cena, double potrebnaPlocha) {
        super(nazev, cena, potrebnaPlocha, 50); 
    }

    @Override
    public String getInfo() {
        return "Květina: " + name + ", Cena: " + price + ", Potřebná plocha: " + neededArea + "m², Šance na růst: " + chanceOfGrowth + "%";
    }
}
