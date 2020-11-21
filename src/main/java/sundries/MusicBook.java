package sundries;

import behaviours.ISell;

public class MusicBook implements ISell {
    private String description;
    private double buyPrice;
    private double sellPrice;

    public MusicBook(String description, double buyPrice, double sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }


    public double CalculateMarkup() {
        return (sellPrice - buyPrice)/buyPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
