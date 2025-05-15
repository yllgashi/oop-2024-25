package lecture66_composition_design_computer;

public class Processor {
    private int id;
    private int produceYear;
    private String speed;

    public Processor() {
    }

    public Processor(int id, int produceYear, String speed) {
        this.setId(id);
        this.setProduceYear(produceYear);
        this.setSpeed(speed);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduceYear() {
        return produceYear;
    }

    public void setProduceYear(int produceYear) {
        this.produceYear = produceYear;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
