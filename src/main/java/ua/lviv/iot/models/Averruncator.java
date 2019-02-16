package ua.lviv.iot.models;

public class Averruncator extends GardenTool {
    private Hand hand;
    private double cutOffDiameter;

    public Averruncator(double weight, double price, String countryOfOrigin, String manufacturer,
                        String material, int yearsOfWarranty, Purpose purpose, Hand hand, double cutOffDiameter) {
        super(weight, price, countryOfOrigin, manufacturer, material, yearsOfWarranty, purpose);
        this.hand = hand;
        this.cutOffDiameter = cutOffDiameter;
    }

    public Averruncator() {
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public double getCutOffDiameter() {
        return cutOffDiameter;
    }

    public void setCutOffDiameter(double cutOffDiameter) {
        this.cutOffDiameter = cutOffDiameter;
    }
}
