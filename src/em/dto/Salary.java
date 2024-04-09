package em.dto;

public class Salary {
    private double basic;
    private double hra;
    public double getBasic() {
        return basic;
    }
    public void setBasic(double basic) {
        this.basic = basic;
    }
    public double getHra() {
        return hra;
    }
    public void setHra(double hra) {
        this.hra = hra;
    }
    public double getPf() {
        return pf;
    }
    public void setPf(double pf) {
        this.pf = pf;
    }
    public double getProftax() {
        return proftax;
    }
    public void setProftax(double proftax) {
        this.proftax = proftax;
    }
    public double getNetsalary() {
        return netsalary;
    }
    public void setNetsalary(double netsalary) {
        this.netsalary = netsalary;
    }
    private double pf;
    private double proftax;
    private double netsalary;
    public void calculatesalary(){
        netsalary = basic+hra-pf-proftax;
    }
    public Salary(double basic, double hra, double pf, double proftax, double netsalary) {
        this.basic = basic;
        this.hra = hra;
        this.pf = pf;
        this.proftax = proftax;
        this.netsalary = netsalary;
    }
    public Salary() {
    }
    
}
