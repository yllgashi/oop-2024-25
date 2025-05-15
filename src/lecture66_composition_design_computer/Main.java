package lecture66_composition_design_computer;

public class Main {
    public static void main(String[] args) {
        Processor processor1 = new Processor(1, 2024, "3Ghz");
        Ram ram1 = new Ram(1, 32000, 50.00);
        HardDiskDrive hardDiskDrive1 = new HardDiskDrive(1, 512000, 2024);
        Computer computer1 = new Computer(1, "Lenovo i7 13gen", 1300, processor1, ram1, hardDiskDrive1);


        Processor processor2 = new Processor(2, 2020, "2.5Ghz");
        Ram ram2 = new Ram(2, 8000, 50.00);
        HardDiskDrive hardDiskDrive2 = new HardDiskDrive(2, 512000, 2022);
        Computer computer2 = new Computer(2, "Lenovo i5 10gen", 700, processor2, ram2, hardDiskDrive2);


        // *********************************
        System.out.println("Computer 1 information...");
        System.out.println("ID  :" + computer1.getId());
        System.out.println("Name  :" + computer1.getName());
        System.out.println("Processor ID :" + computer1.getProcessor().getId());
        System.out.println("Processor Speed :" + computer1.getProcessor().getSpeed());
        System.out.println("Processor Year :" + computer1.getProcessor().getProduceYear());
        System.out.println("RAM ID :" + computer1.getRam().getId());
        System.out.println("RAM Capacity :" + computer1.getRam().getCapacity());
        System.out.println("Hard Disk Drive ID :" + computer1.getHardDiskDrive().getId());
        System.out.println("Hard Disk Drive Capacity :" + computer1.getHardDiskDrive().getCapacity());
        System.out.println("Hard Disk Drive Year :" + computer1.getHardDiskDrive().getProduceYear());


        System.out.println();
        System.out.println("**************************");
        System.out.println();
        System.out.println("Computer 2 information...");
        System.out.println("ID  :" + computer2.getId());
        System.out.println("Name  :" + computer2.getName());
        System.out.println("Processor ID :" + computer2.getProcessor().getId());
        System.out.println("Processor Speed :" + computer2.getProcessor().getSpeed());
        System.out.println("Processor Year :" + computer2.getProcessor().getProduceYear());
        System.out.println("RAM ID :" + computer2.getRam().getId());
        System.out.println("RAM Capacity :" + computer2.getRam().getCapacity());
        System.out.println("Hard Disk Drive ID :" + computer2.getHardDiskDrive().getId());
        System.out.println("Hard Disk Drive Capacity :" + computer2.getHardDiskDrive().getCapacity());
        System.out.println("Hard Disk Drive Year :" + computer2.getHardDiskDrive().getProduceYear());
    }
}
