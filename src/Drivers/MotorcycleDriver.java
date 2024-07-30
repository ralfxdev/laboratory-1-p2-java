package Drivers;

public class MotorcycleDriver extends Driver {
    boolean haveLicense;
    public MotorcycleDriver(String name, String license, boolean haveLicense) {
        super(name, license);
        this.haveLicense = haveLicense;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        if(haveLicense){
            System.out.println("License is available");
        }
        else {
            System.out.println("License is not available");
        }
    }
}
