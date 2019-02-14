package ua.lviv.iot.lab_3.models;

public abstract class GardenTool {
    private double weight;
    private double price;
    private String countryOfOrigin;
    private String manufacturer;
    private String material;
    private int yearsOfWarranty;
    private Purpose purpose;

    public GardenTool(double weight, double price, String countryOfOrigin, String manufacturer,
                      String material, int yearsOfWarranty, Purpose purpose) {
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

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getYearsOfWarranty() {
        return yearsOfWarranty;
    }

    public void setYearsOfWarranty(int yearsOfWarranty) {
        this.yearsOfWarranty = yearsOfWarranty;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }
}
