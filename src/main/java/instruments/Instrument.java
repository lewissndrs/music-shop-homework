package instruments;

public abstract class Instrument{
    private Condition condition;
    private boolean secondHand;
    private boolean onDisplay;
    private String manufacturer;
    private String model;
    private String colour;

    public Instrument(Condition condition, boolean secondHand, boolean onDisplay, String manufacturer, String model, String colour) {
        this.condition = condition;
        this.secondHand = secondHand;
        this.onDisplay = onDisplay;
        this.manufacturer = manufacturer;
        this.model = model;
        this.colour = colour;
    }

    public Condition getCondition() {
        return condition;
    }

    public boolean isSecondHand() {
        return secondHand;
    }

    public boolean isOnDisplay() {
        return onDisplay;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }
}
