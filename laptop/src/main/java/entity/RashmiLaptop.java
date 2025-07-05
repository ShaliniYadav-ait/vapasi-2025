package entity;

public class RashmiLaptop implements CreateLaptopForUser{

    @Override
    public Laptop buildLaptop(){
        HardDisk h1 = new HardDisk("HDD", "512GB");
        Processor p1 = new Processor(3, 3.2);
        RAM r1 = new RAM(8, 5);
       return new Laptop(h1, p1, r1);
    }
}
