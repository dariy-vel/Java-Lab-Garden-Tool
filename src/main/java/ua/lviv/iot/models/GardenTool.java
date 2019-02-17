package ua.lviv.iot.models;

public abstract class GardenTool {
    private double weight;
    private double price;
    private String countryOfOrigin;
    private String manufacturer;
    private String material;
    private int yearsOfWarranty;
    private Purpose purpose;

    public GardenTool(final double weight, final double price,
                      final String countryOfOrigin, final String manufacturer,
                      final String material, final int yearsOfWarranty,
                      final Purpose purpose) {
        this.weight = weight;
        this.price = price;
        this.countryOfOrigin = countryOfOrigin;
        this.manufacturer = manufacturer;
        this.material = material;
        this.yearsOfWarranty = yearsOfWarranty;
        this.purpose = purpose;
    }

    public GardenTool() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(final double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(final String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(final String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(final String material) {
        this.material = material;
    }

    public int getYearsOfWarranty() {
        return yearsOfWarranty;
    }

    public void setYearsOfWarranty(final int yearsOfWarranty) {
        this.yearsOfWarranty = yearsOfWarranty;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(final Purpose purpose) {
        this.purpose = purpose;
    }
}
