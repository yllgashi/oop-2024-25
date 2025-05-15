package lecture66_composition_design_computer;

public class HardDiskDrive {
    private int id;
    private double capacity;
    private int produceYear;

    public HardDiskDrive() {
    }

    public HardDiskDrive(int id, double capacity, int produceYear) {
        this.setId(id);
        this.setCapacity(capacity);
        this.setProduceYear(produceYear);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getProduceYear() {
        return produceYear;
    }

    public void setProduceYear(int produceYear) {
        this.produceYear = produceYear;
    }
}
