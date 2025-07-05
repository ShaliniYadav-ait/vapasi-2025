package entity;

public class User {
    private String user;
    private Laptop laptop;

    User(String name, Laptop laptopDetails) {
        this.user = name;
        this.laptop = laptopDetails;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Laptop getLaptop() {
        return this.laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

}
