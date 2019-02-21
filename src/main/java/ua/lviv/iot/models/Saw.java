package ua.lviv.iot.models;

public class Saw extends GardenTool {

    private double bladeLength;
    private DriveType driveType;

    public Saw(final double weight, final double price,
               final String countryOfOrigin, final String manufacturer,
               final String material, final int yearsOfWarranty,
               final Purpose purpose, final double bladeLength,
               final DriveType driveType) {
        super(weight, price, countryOfOrigin, manufacturer,
                material, yearsOfWarranty, purpose);
        this.bladeLength = bladeLength;
        this.driveType = driveType;
    }

    public Saw() {
    }

    public String getHeaders() {
        return super.getHeaders() + ", bladeLength" +
                ", driveType";
    }

    public String toCSV() {
        return super.toCSV() +
                ", " + bladeLength +
                ", " + driveType;
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(final double bladeLength) {
        this.bladeLength = bladeLength;
    }

    public DriveType getDriveType() {
        return driveType;
    }

    public void setDriveType(final DriveType driveType) {
        this.driveType = driveType;
    }
}
