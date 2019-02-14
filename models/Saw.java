package ua.lviv.iot.lab_3.models;

public class Saw extends GardenTool {

    private double bladeLength;
    private DriveType driveType;

    public Saw(double weight, double price, String countryOfOrigin, String manufacturer,
               String material, int yearsOfWarranty, Purpose purpose, double bladeLength, DriveType driveType) {
        super(weight, price, countryOfOrigin, manufacturer, material, yearsOfWarranty, purpose);
        this.bladeLength = bladeLength;
        this.driveType = driveType;
    }

    public Saw() {
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
    }

    public DriveType getDriveType() {
        return driveType;
    }

    public void setDriveType(DriveType driveType) {
        this.driveType = driveType;
    }
}
