package phone;

public class RussianPhoneNumberValidator implements PhoneNumberValidator {
    @Override
    public void validate(String phone) {
        if (phone.length() != 10) {
            throw new RuntimeException("Russian Phone is not valid, it must contains 10 digits");
        }
    }
}
