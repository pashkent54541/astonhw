package employee;

import java.util.Objects;

public class Email {

    private final String email;

    //Простая проверка на то, является ли строка чьим-то E-mail
    //Нужен символ "@" и "."
    private Email(String email) {
        if (Objects.isNull(email)) {
            throw new IllegalArgumentException("E-mail is required");
        }
        if (email.isBlank()) {
            throw new IllegalArgumentException("E-mail must not be blank");
        }
        if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("E-mail must be valid");
        }
        this.email = email;
    }

    public static Email of(String email) {
        return new Email(email);
    }

    @Override
    public String toString() {
        return "employee.Email{" +
                "email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email1 = (Email) o;

        return email.equals(email1.email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }


}
