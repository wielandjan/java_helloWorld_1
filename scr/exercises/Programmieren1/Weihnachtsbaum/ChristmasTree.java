package exercises.Programmieren1.Weihnachtsbaum;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTree {
    private final String type;
    private final double sizeInM;
    private final List<Candle> candles;

    public ChristmasTree(String type, double sizeInM) {
        this.type = type;
        this.sizeInM = sizeInM;
        this.candles = new ArrayList<>();
    }

    public void addCandle(Candle candle) {
        this.candles.add(candle);
    }

    public void lightChristmasTree() {
        for (Candle candle : candles) {
            candle.lightACandle();
        }
    }

    public int getNumberOfElectricCandles() {
        int counter = 0;
        for (Candle candle : candles) {
            if (candle instanceof ElectricCandle) {
                counter++;
            }
        }
        return counter;
    }

    public List<Candle> candles() {
        return candles;
    }
}
