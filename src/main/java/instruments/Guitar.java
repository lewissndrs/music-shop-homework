package instruments;

import behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private String guitarType;
    private int strings;
    private String fretboardMaterial;
    private Double buyPrice;
    private Double sellPrice;

    public Guitar(Condition condition, boolean secondHand, boolean onDisplay, String manufacturer, String model, String colour, String guitarType, int strings, String fretboardMaterial,double buyPrice, double sellPrice) {
        super(condition, secondHand, onDisplay, manufacturer, model, colour);
        this.guitarType = guitarType;
        this.strings = strings;
        this.fretboardMaterial = fretboardMaterial;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public int getStrings() {
        return strings;
    }

    public String getFretboardMaterial() {
        return fretboardMaterial;
    }

    public String play(){
        return "TWANG";
    }

    public String stairway(){
        return "NO STAIRWAY! DENIED!";
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
