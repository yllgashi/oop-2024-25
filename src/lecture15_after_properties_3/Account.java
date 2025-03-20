package lecture15_after_properties_3;


// email should contain '@' // when initializing (when setting value to variable) +
// password should be at least 8 characters long (when setting value to variable) +
// you should be administrator in order to read password once it is created (when getting value from variable) +


public class Account {
    private String email;
    private String password;

    public void setEmail(String emailFromUser) {
        if (emailFromUser.contains("@")) {
            email = emailFromUser;
        } else {
            System.out.println("Email does not content - @ -");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String passwordFromUser) {
        if (passwordFromUser.length() >= 8) {
            password = passwordFromUser;
        }
    }

    public String getPassword() {
        if ("ADMINISTRATOR".equals("ADMINISTRATOR")) {
            return password;
        } else return "";
    }
}
