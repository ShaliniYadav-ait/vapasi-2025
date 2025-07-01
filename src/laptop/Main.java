package laptop;

public class Main {
    public static void main(String[] args) {
        User rashmi = rashmiLaptop();
        rashmi.LaptopDetails();
        User manav = manavLaptop();
        manav.LaptopDetails();
    }

    private static User manavLaptop() {
        HardDisk h2 = new HardDisk("SSD", "1TB");
        Processor p2 = new Processor(2, 3.2);
        RAM r2 = new RAM(6,6);
        Laptop manavLaptop = new Laptop(h2,p2,r2);
        return new User("Manav", manavLaptop);
    }

    private static User rashmiLaptop() {
        HardDisk h1 = new HardDisk("HDD", "512GB");
        Processor p1 = new Processor(3, 3.2);
        RAM r1 = new RAM(8,5);
        Laptop rashmiLaptop = new Laptop(h1,p1,r1);
        return new User("Rashmi", rashmiLaptop);
    }
}