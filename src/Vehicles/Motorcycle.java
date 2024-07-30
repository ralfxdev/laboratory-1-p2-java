package Vehicles;

public class Motorcycle extends Vehicle {
    private boolean haveSidecar;
    public Motorcycle(String brand, String model, int year, boolean haveSidecar) {
        super(brand, model, year);
        this.haveSidecar = haveSidecar;
    }
    @Override
    public void getDetails(){
        super.getDetails();
        if (haveSidecar){
            System.out.println("Have sidecar");
        } else {
            System.out.println("Have no sidecar");
        }
    }
}
