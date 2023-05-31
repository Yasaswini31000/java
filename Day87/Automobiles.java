import java.util.Arrays;


public class Automobiles {
    public static void main(String[] args) {
        ShowRoom s1 = new ShowRoom();
        s1.setName(" SS AutoMobiles");
        s1.setBranch("Nellore");
        s1.setContactNumber(934524566);
        BikeEx b1 = new BikeEx();
        b1.setType(Type.Gear);
        b1.setBrand("Honda");
        b1.setPrice(70000);
        b1.setMileage("80km/lit");
        b1.setMaxSpeed(160);
        b1.setInitialStock(200);
        b1.setSold(100);
        b1.setCurrentStock();
        BikeEx b2 = new BikeEx();
        b2.setType(Type.nonGear);
        b2.setBrand("Vespa");
        b2.setPrice(100000);
        b2.setMileage("50km/lit");
        b2.setMaxSpeed(140);
        b2.setInitialStock(1000);
        b2.setSold(400);
        b2.setCurrentStock();
        BikeEx[] bike = {b1,b2};
        CarEx c1 = new CarEx();
        c1.setType(FuelType.Petrol);
        c1.setCompany("Maruti Suzuki");
        c1.setMileage("25km/lit");
        c1.setModel("Swift");
        c1.setSpeed("200km/hr");
        c1.setOperatingSystem(AutomaticSystem.Sensor);
        c1.setInitialStock(1000);
        c1.setSold(500);
        c1.setCurrentStock();
        CarEx c2 = new CarEx();
        c2.setType(FuelType.Diesel);
        c2.setCompany("Mahindra");
        c2.setMileage("35km/hr");
        c2.setSpeed("190km/hr");
        c2.setModel("Thor");
        c2.setOperatingSystem(AutomaticSystem.nonSensor);
        c2.setInitialStock(1500);
        c2.setSold(1100);
        c2.setCurrentStock();
        CarEx[] car ={c1,c2};
    }
}
class ShowRoom {
    String name;
    String branch;
    long contactNumber;
    Object[] CarEx;
    Object[] BikeEx;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Object[] getCarEx() {
        return CarEx;
    }

    public void setMobiles(Object[] car) {
        CarEx = car;
    }

    public Object[] getBikeEx() {
        return BikeEx;
    }

    public void setBikeEx(Object[] bike) {
        BikeEx = bike;
    }

    @Override
    public String toString() {
        return "ShowRoom{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", contactNumber=" + contactNumber +
                ", Mobiles=" + Arrays.toString(CarEx) +
                ", Computers=" + Arrays.toString(BikeEx) +
                '}';
    }
}
