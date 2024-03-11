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

}
