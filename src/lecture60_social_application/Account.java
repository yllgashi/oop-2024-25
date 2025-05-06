package lecture60_social_application;

public class Account {
    // attributes
    private int id;
    private String username;
    private String password;


    // constructors
    public Account() {
    }

    public Account(int id, String username, String password) {
        this.setId(id);
        this.setUsername(username);
        this.setPassword(password);
    }


    // properties
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
