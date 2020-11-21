package instruments;

import behaviours.ISell;

public class Keyboard extends Instrument implements IPlay, ISell {
    private String keyboardType;
    private int keys;
    private double buyPrice;
    private double sellPrice;

    public Keyboard(Condition condition, boolean secondHand, boolean onDisplay, String manufacturer, String model, String colour, String keyboardType, int keys, double buyPrice, double sellPrice) {
        super(condition, secondHand, onDisplay, manufacturer, model, colour);
        this.keyboardType = keyboardType;
        this.keys = keys;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public int getKeys() {
        return keys;
    }

    public String play(){
        return "plink plonk";
    }

    public String bohemianRhapsody(){
        return "Hi, could you kindly please stop playing that song and never go near a keyboard again?";
    }

    public double CalculateMarkup(){
        return (sellPrice - buyPrice)/buyPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
