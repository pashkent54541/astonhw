import java.util.Objects;

public class EmployeeName {

    private final String firstName;
    private final String lastName;
    private final String fatherName;


    private EmployeeName(String firstName, String lastName, String fatherName) {
        if (Objects.isNull(firstName) || Objects.isNull(lastName)) {
            throw new IllegalArgumentException("First Name and Last Name must not be null");
        }
        if (firstName.isBlank() || lastName.isBlank()) {
            throw new IllegalArgumentException("First Name and Last Name must not be blank");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = Objects.isNull(fatherName) ? "" : fatherName;
    }

    @Override
    public String toString() {
        return "EmployeeName{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }

    public static EmployeeName ofThreeParams(String firstName, String lastName, String fatherName) {
        return new EmployeeName(firstName, lastName, fatherName);
    }

    // Парсим имя из одной строки. На вход ожидаем формат ФИО.
    public static EmployeeName parseName(String fullName) {
        String[] splitString = fullName
                .trim()
                .replaceAll(" +", " ")
                .split(" ", 3);
        if (splitString.length < 2) {
            throw new IllegalArgumentException("First Name and Last Name required");
        } else if (splitString.length == 2) {
            return new EmployeeName(splitString[0], splitString[1], "");
        } else {
            return new EmployeeName(splitString[0], splitString[1], splitString[2]);
        }
    }

}
