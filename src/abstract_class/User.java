package abstract_class;

public abstract class User {
    private String name;
    private String email;
    private String adress;
    private String phone;

    public User(String name, String email, String adress, String phone) {
        this.name = name;
        this.email = email;
        this.adress = adress;
        this.phone = phone;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public abstract String getInfo();
}
