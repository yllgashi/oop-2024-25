package lecture88_polymorphism_banks;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RaiffaisenBank raiffaisenBankInKosovo = new RaiffaisenBank();
        TebBank tebBankInKosovo = new TebBank();

        // polymorphism
        System.out.println("Monthly fee of Raifaissen: " + raiffaisenBankInKosovo.calculateMonthlyFee());
        System.out.println("Monthly fee of Raifaissen: " + tebBankInKosovo.calculateMonthlyFee());

        // polymorphism call
        ArrayList<Bank> banksInKosovo = new ArrayList<>();
        banksInKosovo.add(raiffaisenBankInKosovo);
        banksInKosovo.add(tebBankInKosovo);

        for (int i = 0; i < banksInKosovo.size(); i ++) {
            System.out.println(banksInKosovo.get(i).calculateMonthlyFee());
        }
    }



}
