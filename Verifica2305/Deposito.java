import java.util.HashMap;
import java.util.Map;

public class Deposito {
    private Map<Integer, Container> mappaContainer;

    public Deposito() {
        mappaContainer = new HashMap<>();
    }

    public void aggiungiContainer(Container container, int postazione) {
        mappaContainer.put(postazione, container);
    }

    public Container ricercaContainer(int postazione) {
        return mappaContainer.get(postazione);
    }
    
    public void rimuoviContainer(int postazione) {
        mappaContainer.remove(postazione);
    }
}