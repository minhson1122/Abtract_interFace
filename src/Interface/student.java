package Interface;


import abstract_class.User;

public class student extends User {
    private String group;
    private double GPV;
    public student(String name, String email, String adress, String phone,String group, double GPV) {
        super(name, email, adress, phone);
        this.GPV = GPV;
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGPV() {
        return GPV;
    }

    public void setGPV(double GPV) {
        this.GPV = GPV;
    }

    @Override
    public String getInfo() {
        return "thông tin sinh viên :" + this.getName() + this.getPhone() + this.getAdress();
    }
}
