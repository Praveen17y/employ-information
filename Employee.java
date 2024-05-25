
import java.util.Scanner;

class Employee {
    int empNo;
    String empName;
    String joinDate;
    String designationCode;
    String department;
    double basic;
    double hra;
    double it;

    public Employee(int empNo, String empName, String joinDate, String designationCode, String department, double basic, double hra, double it) {
        this.empNo = empNo;
        this.empName = empName;
        this.joinDate = joinDate;
        this.designationCode = designationCode;
        this.department = department;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }
}


