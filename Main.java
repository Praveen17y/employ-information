import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(1001, "Ashish", "01/04/2009", "e", "R&D", 20000, 8000, 3000),
                new Employee(1002, "Sushma", "23/08/2012", "c", "PM", 30000, 12000, 9000),
                new Employee(1003, "Rahul", "12/11/2008", "k", "Acct", 10000, 8000, 1000),
                new Employee(1004, "Chahat", "29/01/2013", "r", "Front Desk", 12000, 6000, 2000),
                new Employee(1005, "Ranjan", "16/07/2005", "m", "Engg", 50000, 20000, 20000),
                new Employee(1006, "Suman", "01/01/2000", "e", "Manufacturing", 23000, 9000, 4400),
                new Employee(1007, "Tanmay", "12/06/2006", "c", "PM", 29000, 12000, 10000)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();

        Employee emp = findEmployeeById(employees, empId);
        if (emp != null) {
            displayEmployeeDetails(emp);
        } else {
            System.out.println("There is no employee with empid: " + empId);
        }

        scanner.close();
    }

    public static Employee findEmployeeById(Employee[] employees, int empId) {
        for (Employee emp : employees) {
            if (emp.empNo == empId) {
                return emp;
            }
        }
        return null;
    }

    public static void displayEmployeeDetails(Employee emp) {
        String designation = getDesignation(emp.designationCode);
        double da = getDA(emp.designationCode);
        double salary = emp.basic + emp.hra + da - emp.it;

        System.out.println("Emp No.\t\t" + emp.empNo);
        System.out.println("Emp Name\t" + emp.empName);
        System.out.println("Department\t" + emp.department);
        System.out.println("Designation\t" + designation);
        System.out.println("Salary\t\t" + salary);
    }

    public static String getDesignation(String designationCode) {
        switch (designationCode) {
            case "e": return "Engineer";
            case "c": return "Consultant";
            case "k": return "Clerk";
            case "r": return "Receptionist";
            case "m": return "Manager";
            default: return "Unknown";
        }
    }

    public static double getDA(String designationCode) {
        switch (designationCode) {
            case "e": return 20000;
            case "c": return 32000;
            case "k": return 12000;
            case "r": return 15000;
            case "m": return 40000;
            default: return 0;
        }
    }
}


