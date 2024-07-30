import Drivers.CarDriver;
import Drivers.MotorcycleDriver;
import Vehicles.Car;
import Vehicles.Motorcycle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Hilux", 2015, 4);
        car.getDetails();

        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2000, true);
        motorcycle.getDetails();

        CarDriver carDriver = new CarDriver("John", "12345678", 4);
        carDriver.getInfo();

        MotorcycleDriver motorcycleDriver = new MotorcycleDriver("Mary", "87654321", false);
        motorcycleDriver.getInfo();
    }
}