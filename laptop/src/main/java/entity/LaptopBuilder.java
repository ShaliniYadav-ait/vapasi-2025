package entity;

import static entity.ShowLaptopDetails.showDetails;

public class LaptopBuilder {
    public static void main(String[] args) {
        ManavLaptop m = new ManavLaptop();
        RashmiLaptop r = new RashmiLaptop();
        User manav = new User("Manav", m.buildLaptop());
        User rashmi = new User("Rashmi", r.buildLaptop());
        showDetails(manav);
        showDetails(rashmi);
    }
}
