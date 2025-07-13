package vehicle;

public class VehicleMain {
    public static void main(String[] arg){

        // POLY MORPH
        Bike bike = new Bike();
        Boat boat = new Boat();
        Car car = new Car();

        Vehicle[] vehicles= {car, bike, boat};

        for (Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}
