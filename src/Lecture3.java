import employee.Email;
import employee.EmployeeAge;
import employee.EmployeeName;
import employee.JobTitle;
import phone.PhoneCode;
import phone.PhoneNumber;

import java.util.Arrays;
import java.util.Objects;

public class Lecture3 {

    public static void main(String[] args) {

        Employee[] employeesArr = new Employee[5];
        employeesArr[0] = new Employee(
                EmployeeName.parseName("Сергей Сыс"),
                JobTitle.LECTOR,
                Email.of("sergeysys@aston.ru"),
                PhoneNumber.of(9998887766L, PhoneCode.RUSSIAN),
                JobTitle.LECTOR.defaultSalary(),
                EmployeeAge.of(30));

        employeesArr[1] = new Employee(
                EmployeeName.parseName("Vlad Tendovitskiy"),
                JobTitle.INSPECTOR,
                Email.of("VladTendov@aston.ru"),
                PhoneNumber.of(1112223344L, PhoneCode.RUSSIAN),
                JobTitle.INSPECTOR.defaultSalary(),
                EmployeeAge.of(28));

        employeesArr[2] = new Employee(
                EmployeeName.parseName("Veronika Kukharskaya"),
                JobTitle.GROUP_OWNER,
                Email.of("VeronikaKukhakaya@aston.ru"),
                PhoneNumber.of(123456789L, PhoneCode.BELORUSSIAN),
                JobTitle.GROUP_OWNER.defaultSalary(),
                EmployeeAge.of(24));
        employeesArr[3] = new Employee(
                EmployeeName.parseName("Павел Харитонов Юрьевич"),
                JobTitle.INTERN,
                Email.of("kharitonov54541@gmail.com"),
                PhoneNumber.of(9508943625L, PhoneCode.RUSSIAN),
                JobTitle.INTERN.defaultSalary(),
                EmployeeAge.of(24));
        employeesArr[4] = new Employee(
                EmployeeName.parseName("Александр Петренко"),
                JobTitle.INTERN,
                Email.of("AlexPetrenko@mail.ru"),
                PhoneNumber.of(6665554433L, PhoneCode.RUSSIAN),
                JobTitle.INTERN.defaultSalary(),
                EmployeeAge.of(27));
        System.out.println(Arrays.toString(employeesArr));

        Park.Attraction wheel = Park.Attraction.of("Ferris wheel",
                "9:00-21:00",
                150);

        System.out.println(wheel);

    }
}
