package phone;

public class UkranianPhoneNumberValidator implements PhoneNumberValidator {
    @Override
    public void validate(String phone) {
        if(phone.length() != 7) {
            throw new RuntimeException("Ukrainian phone is not valid, it must contains 7 digits");
        }
    }
}
