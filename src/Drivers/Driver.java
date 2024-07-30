package Drivers;

public class Driver {
    private String name;
    private String license;
    public Driver(String name, String license) {
        this.name = name;
        this.license = license;
    }

    public void getInfo(){
        System.out.println("Name: " + name);
        System.out.println("License: " + license);
    }
}
