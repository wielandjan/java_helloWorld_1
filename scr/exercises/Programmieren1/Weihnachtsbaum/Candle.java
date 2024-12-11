package exercises.Programmieren1.Weihnachtsbaum;

public class Candle {
    protected boolean isBurning;
    private final String colour;

    public Candle(String colour) {
        this.colour = colour;
    }

    public void lightACandle() {
        this.isBurning = true;
    }

    public void turnOffACandle() {
        this.isBurning = false;
    }
}
