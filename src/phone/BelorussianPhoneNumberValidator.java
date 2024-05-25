package phone;

public class BelorussianPhoneNumberValidator implements PhoneNumberValidator {

    @Override
    public void validate(String phone) {
        if (phone.length() != 9) {
            throw new RuntimeException("Belorussian phone is not valid, it must contains 9 digits");
        }
    }
}
