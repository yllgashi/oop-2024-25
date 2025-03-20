package lecture18_with_vs_without_properties;

public class Main {
    public static void main(String[] args) {
        // no validation
        Account1 account1 = new Account1();
        account1.email = "notLegitEmail";
        account1.password = "notvalidatedpass";

        // validation through properties
        Account2 account2 = new Account2();
        account2.setEmail("notLegitEmail"); // this email will not be assigned to attribute due to validation
        account2.setEmail("filan@fisteku.com"); // done
        account2.setPassword("notvalidatedpass"); // validation will stop initialization of "password" global variable
        account2.setPassword("AbcDef12345@@@!!!$$%%^^"); // done

        account2.getEmail("BASIC_USER"); // will return "NO_ACCESS"
        account2.getEmail("ADMIN"); // will return email
        account2.getPassword("BASIC_USER"); // will return "NO_ACCESS"
        account2.getPassword("ADMIN"); // will return password

        //
        Account3 account3 = new Account3();
        account3.setEmail("filan@fisteku.com");
        account3.getEmail();
        account3.setPassword("AbcDef12345@@@!!!$$%%^^");
        account3.getPassword();
    }
}
