package entity;

public  class ShowLaptopDetails {

    public static void showDetails(User u){
        System.out.println("***** Laptop Details ******");
        System.out.println("User name is : "+ u.getUser());
        System.out.println("Hard disk type is : " + u.getLaptop().getHardDisk().getType() + " and size is : " + u.getLaptop().getHardDisk().getSize());
        System.out.println("Processor generation is : " +u.getLaptop().getProcessor().getGeneration()+ " and speed is : " +u.getLaptop().getProcessor().getGHz());
        System.out.println("RAM size is : "+ u.getLaptop().getRam().getSize() + " and generation is : "+ u.getLaptop().getRam().getGeneration());
    }
}
