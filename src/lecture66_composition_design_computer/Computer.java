package lecture66_composition_design_computer;

public class Computer {
    private int id;
    private String name;
    private double price;
    private Processor processor; // each computer has one procesor
    private Ram ram; // each computer has one RAM
    private HardDiskDrive hardDiskDrive; // each computer has one Hard Disk Drive

    public Computer() {
    }

    public Computer(int id, String name, double price, Processor processor, Ram ram, HardDiskDrive hardDiskDrive) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
        this.setProcessor(processor);
        this.setRam(ram);
        this.setHardDiskDrive(hardDiskDrive);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public HardDiskDrive getHardDiskDrive() {
        return hardDiskDrive;
    }

    public void setHardDiskDrive(HardDiskDrive hardDiskDrive) {
        this.hardDiskDrive = hardDiskDrive;
    }
}
