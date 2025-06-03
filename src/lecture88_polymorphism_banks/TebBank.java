package lecture88_polymorphism_banks;

public class TebBank extends Bank {

    @Override
    public double calculateMonthlyFee() {
        return 1.50;
    }
}
