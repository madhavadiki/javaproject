package arrays.object;

import em.dto.Address;
import em.dto.Employee33;
import em.dto.Salary;


// Employee Class
 
public class Employee403 {
    public static void main(String[] args) {
        //Creating of object using default constructor
        System.out.println("Employee403");
        Employee33 e1 = new Employee33();
        Address ad = new Address();
        Salary s = new Salary();
        s.setBasic(10000);
        s.setHra(5000);
        s.setPf(1000);
        s.setProftax(500);
        s.calculatesalary();
        ad.setHno("1/106-b");
        ad.setPincode(519360); 
        e1.setName("mad");
        e1.setAddress(ad);
        e1.setSalary(s);
        e1.printEmployeedetails();

        //cration of object using prametersized constructors
        //create an object along with some data
        Address ad1 = new Address("1/106", 518360);
        Salary s1 = new Salary(10000, 10000, 500, 5000, 500000);
        Employee33 e2 = new Employee33("mad", ad1, s1);
        e2.printEmployeedetails();
    }
}
