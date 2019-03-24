package ua.lviv.iot.gardenTool.models;

import javax.persistence.Entity;

@Entity
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

    public String getHeaders() {
        return super.getHeaders() + ", bladeWidth";
    }

    public String toCSV() {
        return super.toCSV()
                + ", " + bladeWidth;
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(final double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }
}
