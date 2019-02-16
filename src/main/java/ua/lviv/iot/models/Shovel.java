package ua.lviv.iot.models;

public class Shovel extends GardenTool {
    private double handleLength;

    public Shovel(double weight, double price, String countryOfOrigin, String manufacturer,
                  String material, int yearsOfWarranty, Purpose purpose, double handleLength) {
        super(weight, price, countryOfOrigin, manufacturer, material, yearsOfWarranty, purpose);
        this.handleLength = handleLength;
    }

    public Shovel() {
    }

    public double getHandleLength() {
        return handleLength;
    }

    public void setHandleLength(double handleLength) {
        this.handleLength = handleLength;
    }
}
