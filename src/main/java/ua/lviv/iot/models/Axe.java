package ua.lviv.iot.models;

public class Axe extends GardenTool {
    private double bladeWidth;

    public Axe(double weight, double price, String countryOfOrigin, String manufacturer,
               String material, int yearsOfWarranty, Purpose purpose, double bladeWidth) {
        super(weight, price, countryOfOrigin, manufacturer, material, yearsOfWarranty, purpose);
        this.bladeWidth = bladeWidth;
    }

    public Axe() {
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }
}
