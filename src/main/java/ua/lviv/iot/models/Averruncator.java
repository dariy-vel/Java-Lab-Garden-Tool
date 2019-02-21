package ua.lviv.iot.models;

public class Averruncator extends GardenTool {
    private Hand hand;
    private double cutOffDiameter;

    public Averruncator(final double weight, final double price,
                        final String countryOfOrigin, final String manufacturer,
                        final String material, final int yearsOfWarranty,
                        final Purpose purpose, final Hand hand,
                        final double cutOffDiameter) {
        super(weight, price, countryOfOrigin, manufacturer,
                material, yearsOfWarranty, purpose);
        this.hand = hand;
        this.cutOffDiameter = cutOffDiameter;
    }

    public Averruncator() {
    }

    public String getHeaders() {
        return super.getHeaders() + ", hand" +
                ", cutOffDiameter";
    }

    public String toCSV() {
        return super.toCSV() +
                ", " + hand +
                ", " + cutOffDiameter;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(final Hand hand) {
        this.hand = hand;
    }

    public double getCutOffDiameter() {
        return cutOffDiameter;
    }

    public void setCutOffDiameter(final double cutOffDiameter) {
        this.cutOffDiameter = cutOffDiameter;
    }
}
