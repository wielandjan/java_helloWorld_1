package exercises.Programmieren1.Weihnachtsbaum;

public class ElectricCandle extends Candle {
    private int powerInPercent;

    public ElectricCandle(String colour) {
        super(colour);
        this.powerInPercent = 100;
    }

    @Override
    public void lightACandle() {
        if (powerInPercent >= 10) {
            this.isBurning = true;
            this.powerInPercent -= 10;
        }
    }

    public void recharge() {
        this.powerInPercent = 100;
    }
}
