import employee.Email;
import employee.EmployeeAge;
import employee.EmployeeName;
import employee.JobTitle;
import phone.PhoneNumber;

import java.util.Objects;

public class Employee {

    private final EmployeeName name;
    private final JobTitle jobTitle;
    private final Email email;
    private final PhoneNumber phoneNumber;
    private final int salary;
    private final EmployeeAge employeeAge;

    public Employee(EmployeeName name,
                     JobTitle jobTitle,
                     Email email,
                     PhoneNumber phoneNumber,
                     int salary,
                     EmployeeAge employeeAge) {
        if (Objects.isNull(name)
                || Objects.isNull(email)
                || Objects.isNull(phoneNumber)
                || Objects.isNull(employeeAge)) {
            throw new IllegalArgumentException("Arguments must not be null");
        }
        this.name = name;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.employeeAge = employeeAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", jobTitle=" + jobTitle +
                ", email=" + email +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", employeeAge=" + employeeAge +
                '}';
    }

    public void printInfo() {
        System.out.println(this);
    }


}
