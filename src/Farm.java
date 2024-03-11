import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Flower> rostliny = new ArrayList<>();
    private List<Animal> zvirata = new ArrayList<>();

    public void pridatRostlinu(Flower rostlina) {
        if (rostliny.size() < 5) {
            rostliny.add(rostlina);
        }
    }

    public void odebratRostlinu(Flower rostlina) {
        rostliny.remove(rostlina);
    }

    public void pridatZvire(Animal zvire) {
        if ("velké".equals(zvire.size) && zvirata.stream().filter(z -> "velké".equals(z.size)).count() < 10 ||
                "malé".equals(zvire.size) && zvirata.stream().filter(z -> "malé".equals(z.size)).count() < 10) {
            zvirata.add(zvire);
        }
    }

    public void odebratZvire(Animal zvire) {
        zvirata.remove(zvire);
    }



}
