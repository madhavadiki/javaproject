package em.dto;

public class Address {
    private String hno;
    private int pincode;
    public String getHno() {
        return hno;
    }
    public void setHno(String hno) {
        this.hno = hno;
    }
    public int getPincode() {
        return pincode;
    }
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    public Address(String hno, int pinc){
        this.hno = hno;
        this.pincode = pinc;

    }
    public Address() {
    }
}
