package Vehicles;

public class Car extends Vehicle {
    int numberOfDoors;
    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void getDetails(){
        super.getDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
