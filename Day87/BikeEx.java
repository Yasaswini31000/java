import java.util.Arrays;

public class BikeEx {
    private String Brand;
    private double price;
    private String mileage;
    private int maxSpeed;
    private Type type;
    private int initialStock;
    private int sold;
    private int currentStock;

    private BikeEx[] bike;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getInitialStock() {
        return initialStock;
    }

    public void setInitialStock(int initialStock) {
        this.initialStock = initialStock;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }



    public BikeEx[] getBikeEx() {
        return bike;
    }

    public void setComputers(BikeEx[] bike) {
        this.bike = bike;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock() {
        this.currentStock = this.initialStock-this.sold;
    }

    @Override
    public String toString() {
        return "Bikes {" +
                "Brand='" + Brand + '\'' +
                ", price=" + price +
                ", mileage='" + mileage + '\'' +
                ", maxSpeed =" + maxSpeed +
                ", type=" + type +
                ", initialStock=" + initialStock +
                ", sold=" + sold +
                ", currentStock=" + currentStock +

                '}';
    }
}
enum Type {
    Gear,nonGear;
}

