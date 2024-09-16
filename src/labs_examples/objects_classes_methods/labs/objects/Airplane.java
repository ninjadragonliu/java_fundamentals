package labs_examples.objects_classes_methods.labs.objects;

public class Airplane {

    private AirplaneEngine engine;
    private Wing wing;
    private Cockpit cockpitl;
    private LandingGear landingGear;
    private double fuelCapacity;
    private double fuelLevel;

    public Airplane(AirplaneEngine engine, Wing wing, Cockpit cockpit, LandingGear landingGear, double fuelCapacity, double fuelLevel) {
        this.engine = engine;
        this.wing = wing;
        this.cockpitl = cockpit;
        this.landingGear = landingGear;
        this.fuelCapacity = fuelCapacity;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "engine=" + engine +
                ", wing=" + wing +
                ", cockpitl=" + cockpitl +
                ", landingGear=" + landingGear +
                ", fuelCapacity=" + fuelCapacity +
                ", fuelLevel=" + fuelLevel +
                '}';
    }
}
class Wing {
    double wingSpan;

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return "Wing{" +
                "wingSpan=" + wingSpan +
                '}';
    }
}
class AirplaneEngine {
    double horsePower;

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "AirplaneEngine{" +
                "horsePower=" + horsePower +
                '}';
    }
}
class Cockpit {
    int cockpitHeight;

    public int getCockpitHeight() {
        return cockpitHeight;
    }

    public void setCockpitHeight(int cockpitHeight) {
        this.cockpitHeight = cockpitHeight;
    }

    @Override
    public String toString() {
        return "Cockpit{" +
                "cockpitHeight=" + cockpitHeight +
                '}';
    }
}
class LandingGear {
    int landingGearHeight;

    public int getLandingGearHeight() {
        return landingGearHeight;
    }

    public void setLandingGearHeight(int landingGearHeight) {
        this.landingGearHeight = landingGearHeight;
    }

    @Override
    public String toString() {
        return "LandingGear{" +
                "landingGearHeight=" + landingGearHeight +
                '}';
    }
}

class test {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(new AirplaneEngine(), new Wing(), new Cockpit(), new LandingGear(), 100, 10);
        System.out.println(airplane);
    }
}
