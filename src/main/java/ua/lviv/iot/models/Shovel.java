package ua.lviv.iot.models;

public class Shovel extends GardenTool {
    private double handleLength;

    public Shovel(final double weight, final double price,
                  final String countryOfOrigin, final String manufacturer,
                  final String material, final int yearsOfWarranty,
                  final Purpose purpose, final double handleLength) {
        super(weight, price, countryOfOrigin, manufacturer,
                material, yearsOfWarranty, purpose);
        this.handleLength = handleLength;
    }

    public Shovel() {
    }

    public String getHeaders() {
        return super.getHeaders() + ", handleLength";
    }

    public String toCSV() {
        return super.toCSV() +
                ", " + handleLength;
    }

    public double getHandleLength() {
        return handleLength;
    }

    public void setHandleLength(final double handleLength) {
        this.handleLength = handleLength;
    }
}
