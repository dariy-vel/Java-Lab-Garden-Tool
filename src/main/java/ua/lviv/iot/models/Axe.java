package ua.lviv.iot.models;

public class Axe extends GardenTool {
    private double bladeWidth;

    public Axe(final double weight, final double price,
               final String countryOfOrigin, final String manufacturer,
               final String material, final int yearsOfWarranty,
               final Purpose purpose, final double bladeWidth) {
        super(weight, price, countryOfOrigin, manufacturer,
                material, yearsOfWarranty, purpose);
        this.bladeWidth = bladeWidth;
    }


    public Axe() {
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(final double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }
}
