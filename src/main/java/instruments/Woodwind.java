package instruments;

import behaviours.ISell;

public class Woodwind extends Instrument implements IPlay, ISell {
    private String woodwindType;
    private String reed;
    private Double buyPrice;
    private Double sellPrice;

    public Woodwind(Condition condition, boolean secondHand, boolean onDisplay, String manufacturer, String model, String colour, String woodwindType, String reed, double buyPrice, double sellPrice) {
        super(condition, secondHand, onDisplay, manufacturer, model, colour);
        this.woodwindType = woodwindType;
        this.reed = reed;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getWoodwindType() {
        return woodwindType;
    }

    public String getReed() {
        return reed;
    }

    public String play(){
        return "DOOT";
    }

    public String bakerStreet(){
        return "OH BOY, THAT'S SEXY";
    }

    public double CalculateMarkup(){
        return (sellPrice - buyPrice)/buyPrice;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }
}
