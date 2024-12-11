package exercises.Programmieren1.Geschenkesack;

import java.util.ArrayList;
import java.util.List;

public class GiftBag {
    private final List<Present> presents;

    public GiftBag() {
        presents = new ArrayList<>();
    }

    public void addPresent(Present present) {
        presents.add(present);
    }

    public Present getMostExpensivePresent() {
        Present mostExpensive = presents.get(0);
        for (Present present : presents) {
            if (present.getPriceInEuro() > mostExpensive.getPriceInEuro()) {
                mostExpensive = present;
            }
        }
        return mostExpensive;
    }

    public List<Present> presents() {
        return presents;
    }
}
