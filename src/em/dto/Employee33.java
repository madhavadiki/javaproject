package em.dto;

public class Employee33 {
    private String name;
    private Address address;
    private Salary salary;
    
    //default constructor
    public Employee33() {

    }

    public  Employee33(String name) {
        this.name = name;
    }

    public  Employee33(String n, Address add, Salary s){
        this.name = n;
        this.address = add;
        this.salary = s;
    }

    public Salary getSalary() {
        return salary;
    }
    public void setSalary(Salary salary) {
        this.salary = salary;
    }
    public Address getAddress(){
        return address;
    }
    public void setAddress(Address add){
        address = add;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printEmployeedetails() {
        System.out.println(name);
        System.out.println(address.getHno());
        System.out.println(address.getPincode());
        System.out.println(salary.getNetsalary());
    }
}
