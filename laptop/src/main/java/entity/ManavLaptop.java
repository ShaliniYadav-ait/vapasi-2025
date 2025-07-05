package entity;

public class ManavLaptop implements CreateLaptopForUser {
   @Override
    public Laptop buildLaptop(){
        HardDisk h2 = new HardDisk("SSD", "1TB");
        Processor p2 = new Processor(2, 3.2);
        RAM r2 = new RAM(6, 6);
       return new Laptop(h2, p2, r2);
    };

    public ManavLaptop() {
    }

}
