package Interface;

import abstract_class.User;

import java.util.Objects;

public class Staff extends User implements Istaff {
    private String role;
    public Staff(String name, String email, String adress, String phone,String role) {
        super(name, email, adress, phone);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String getInfo() {
        return "tên nhân viên :" + this.getName() + "-" + " SDT" + this.getPhone() + "-" + " địa chỉ :" + this.getAdress();
    }


    @Override
    public Boolean isAdmin() {
        return Objects.equals(this.getRole(),roleCont.ROLE_ADMIN);
    }

    @Override
    public double solary() {
        return this.isAdmin() ? 12000000.0 : 5000000.0;
    }
}
