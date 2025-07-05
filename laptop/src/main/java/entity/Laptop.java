package entity;

public class Laptop {

    public static final String logo ="Mac";
    private HardDisk hardDisk;
    private Processor processor;
    private RAM ram;

    public Laptop(HardDisk hardDisk,Processor processor, RAM ram) {
        this.hardDisk = hardDisk;
        this.processor = processor;
        this.ram = ram;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }
}
