package lecture18_with_vs_without_properties;

public class Account3 {
    // attributes
    private String email;
    private String password;


    // properties
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (email.contains("@"))
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
