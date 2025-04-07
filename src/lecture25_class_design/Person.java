package lecture25_class_design; // folder name of this class

public class Person {
    public String username; // it is accessible from other classes
    private String password; // it is accessible ONLY inside this class


    // access private attribute from public method
    public void setPassword(String password1) {
        showPassword();
        if (password1.length() > 10) {
            this.password = password;
        }
    }


    // dont have access outside this class
    private void showPassword() {
        System.out.println(this.password);
    }
}
