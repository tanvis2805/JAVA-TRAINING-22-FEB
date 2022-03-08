package Encapsulation;

public class EmployeeData {

    private int SSN;
    private String empName;
    private int empAge;
    private int empID;

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN){
        this.SSN=SSN;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public static void main(String[] args) {
        EmployeeData Kapil = new EmployeeData();
        Kapil.setEmpName("Kapil Singh");
        Kapil.setSSN(123456);
        Kapil.setEmpAge(27);
        Kapil.setEmpID(125);

        System.out.println("Employee name is " + Kapil.getEmpName());

    }
}
