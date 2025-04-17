package lecture52_reference_type_vs_primitive_type;

public class Main {
    public static void main(String[] args) {
        // reference type (object)
        String object = "abcd";
        object.charAt(0); // get character at index 0
        object.length(); // get total text length
        object.contains("c"); // check if 'c' its inside this text

        // primitive type
        int primitiveType = 100;
        // no methods or attributes


        // Example of new reference-type which we created
        MyString referenceType1 = new MyString();
        referenceType1.setText(new char[]{'a', 'b', 'c', 'd'});

        System.out.println(referenceType1.getText());
        System.out.println(referenceType1.length());
        System.out.println(referenceType1.contains('c'));
    }
}
