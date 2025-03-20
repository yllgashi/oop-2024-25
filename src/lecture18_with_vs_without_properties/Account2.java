package lecture18_with_vs_without_properties;

public class Account2 {
    // attributes
    private String email;
    private String password;


    // properties (getters and setters)
    public String getEmail(String userRole) {
        if (userRole.equals("ADMIN")) {
            return this.email;
        }
        return "NO_ACCESS";
    }

    public void setEmail(String email) {
        if (email.contains("@") && email.length() > 5) {
            this.email = email;
        }
    }


    public String getPassword(String userRole) {
        if (userRole.equals("ADMIN")) {
            return this.password;
        }
        return "";
    }

    public void setPassword(String password) {
        if (password.length() > 15) {
            this.password = password;
        }
    }
}
