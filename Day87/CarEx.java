public class CarEx {
    private String company;
    private String mileage;
    private String speed;
    private String model;
    private AutomaticSystem automaticSystem;
    private FuelType  type;

    private int initialStock;
    private int sold;
    private  int currentStock;

    private CarEx[] car;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRam() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getStorage() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public AutomaticSystem getAutomaticSystem() {
        return automaticSystem;
    }

    public void setOperatingSystem(AutomaticSystem automaticSystem) {
        this.automaticSystem = automaticSystem;
    }

    public FuelType getType() {
        return type;
    }

    public void setType(FuelType type) {
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



    public CarEx[] getCarEx() {
        return car;
    }

    public void setMobiles(CarEx[] car) {
        this.car = car;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock() {
        this.currentStock = this.initialStock-this.sold;
    }

    @Override
    public String toString() {
        return "Mobiles{" +
                "Company = " + company + '\'' +
                ", Mileage=" + mileage +
                ", Speed =" + speed +
                ", Model =" + model +
                ", AutomaticSystem=" + automaticSystem +
                ", Type=" + type +
                ", InitialStock=" + initialStock +
                ", Sold=" + sold +
                ", CurrentStock=" + currentStock +

                '}';
    }
}
enum AutomaticSystem {
    Sensor,nonSensor
}

enum  FuelType {
    Petrol, Diesel
}

