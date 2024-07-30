package Drivers;

public class CarDriver extends Driver {
    int xpYears;
    public CarDriver(String name, String license, int xpYears) {
        super(name, license);
        this.xpYears = xpYears;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Xp Years: " + xpYears);
    }
}
