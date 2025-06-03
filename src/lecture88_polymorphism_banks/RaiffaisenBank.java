package lecture88_polymorphism_banks;

public class RaiffaisenBank extends Bank{
    @Override
    public double calculateMonthlyFee() {
        return 2.50;
    }
}
