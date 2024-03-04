package src.loginNDsigin;

public class User {
    private String usenamer, password, name, email, phone, lastName;

    public User(String usenamer, String password, String name, String email, String phone, String lastName) {
        this.usenamer = usenamer;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.lastName = lastName;
    }

    public String getUsername() {
        return usenamer;
    }

    public void setUsenamer(String usenamer) {
        this.usenamer = usenamer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
