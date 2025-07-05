package entity;

public class HardDisk {
    private  String type;
    private  String size;
    public HardDisk(String typeOfDisk, String sizeOfDisk) {
        this.type = typeOfDisk;
        this.size = sizeOfDisk;
    }

    public  String getType() {
        return this.type;
    }

    public  void setType(String typeOfDisk) {
        this.type = typeOfDisk;
    }

    public String getSize() {
        return this.size;
    }

    public   void setSize(String sizeOfDisk) {
       this.size = sizeOfDisk;
    }
}
