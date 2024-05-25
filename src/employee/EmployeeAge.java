package employee;

public class EmployeeAge {

    private final int age;

    @Override
    public String toString() {
        return "EmployeeAge{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeAge that = (EmployeeAge) o;

        return age == that.age;
    }

    @Override
    public int hashCode() {
        return age;
    }

    private EmployeeAge(int age) {
        this.age = age;
        if (age >= 100 || age < 18) {
            throw new IllegalArgumentException("Employee Age must be in range [18;100) ");
        }
    }

    public static EmployeeAge of(int age) {
        return new EmployeeAge(age);
    }

}
