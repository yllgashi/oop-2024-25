package lecture41_packages;

import lecture27_default_values.Person;

public class Product {
    public static void main(String[] args) {
        // this class "Product" it exists inside "lecture40_packages" package

        // this class "Person" exists inside "lecture27_default_values.Person" package and we are importing it in line 3
        Person p1 = new Person();
    }
}
