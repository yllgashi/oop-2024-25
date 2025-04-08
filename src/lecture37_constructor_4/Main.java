package lecture37_constructor_4;

public class Main {
    public static void main(String[] args) {
        // in order to create an account in "facebook"
        // it is mandatory to fill email and password

        // country, bankAccount, streetNumber (its good to have but not mandatory)


        // WITHOUT CONSTRUCTOR -> We can create an account without basic information
        // Account account1 = new Account();
        // account1.setBankAccount("123");
        // account1.setPassword("123456789");


        // WITH CONSTRUCTOR -> We always will provide an email and password for account-creation
        Account account2 = new Account("filan@fisteku.com", "123456789");
        account2.setCountry("Kosova");
    }
}
