package phone;

public class SimpleCountDigitsPhoneNumberValidator implements PhoneNumberValidator {

    private final int requiredDigits;

    public SimpleCountDigitsPhoneNumberValidator(int requiredDigits) {
        this.requiredDigits = requiredDigits;
    }

    @Override
    public void validate(String phone) {
        if (phone.length() != requiredDigits) {
            throw new RuntimeException("Phone is not valid, it must contain " + requiredDigits + " digits");
        }
    }
}
